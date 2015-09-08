/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.marketplace.store.portlet;

import com.liferay.marketplace.configuration.PortletPropsValues;
import com.liferay.marketplace.constants.MarketplaceConstants;
import com.liferay.marketplace.constants.WebKeys;
import com.liferay.marketplace.model.App;
import com.liferay.marketplace.oauth.util.OAuthUtil;
import com.liferay.marketplace.service.AppLocalServiceUtil;
import com.liferay.marketplace.service.AppServiceUtil;
import com.liferay.marketplace.util.MarketplaceLicenseUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.ReleaseInfo;
import com.liferay.portal.kernel.util.ServerDetector;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.theme.ThemeDisplay;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import java.net.URL;

import java.util.Map;
import java.util.Set;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.scribe.model.Token;

/**
 * @author Ryan Park
 */
public class StorePortlet extends RemoteMVCPortlet {

	public void downloadApp(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		long remoteAppId = ParamUtil.getLong(actionRequest, "appId");
		String url = ParamUtil.getString(actionRequest, "url");
		String version = ParamUtil.getString(actionRequest, "version");

		if (!url.startsWith(PortletPropsValues.MARKETPLACE_URL)) {
			JSONObject jsonObject = getAppJSONObject(remoteAppId);

			jsonObject.put("cmd", "downloadApp");
			jsonObject.put("message", "fail");

			writeJSON(actionRequest, actionResponse, jsonObject);

			return;
		}

		URL urlObj = new URL(url);

		File tempFile = null;

		try {
			InputStream inputStream = urlObj.openStream();

			tempFile = FileUtil.createTempFile();

			FileUtil.write(tempFile, inputStream);

			App app = AppServiceUtil.updateApp(remoteAppId, version, tempFile);

			JSONObject jsonObject = getAppJSONObject(app.getRemoteAppId());

			jsonObject.put("cmd", "downloadApp");
			jsonObject.put("message", "success");

			writeJSON(actionRequest, actionResponse, jsonObject);
		}
		finally {
			if (tempFile != null) {
				tempFile.delete();
			}
		}
	}

	public void getApp(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		long remoteAppId = ParamUtil.getLong(actionRequest, "appId");

		JSONObject jsonObject = getAppJSONObject(remoteAppId);

		jsonObject.put("cmd", "getApp");
		jsonObject.put("message", "success");

		writeJSON(actionRequest, actionResponse, jsonObject);
	}

	public void getBundledApps(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();

		Map<String, String> bundledApps = AppLocalServiceUtil.getBundledApps();

		JSONObject bundledAppJsonObject = JSONFactoryUtil.createJSONObject();

		Set<String> keys = bundledApps.keySet();

		for (String key : keys) {
			bundledAppJsonObject.put(key, bundledApps.get(key));
		}

		jsonObject.put("bundledApps", bundledAppJsonObject);

		jsonObject.put("cmd", "getBundledApps");
		jsonObject.put("message", "success");

		writeJSON(actionRequest, actionResponse, jsonObject);
	}

	public void installApp(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		long remoteAppId = ParamUtil.getLong(actionRequest, "appId");

		AppServiceUtil.installApp(remoteAppId);

		JSONObject jsonObject = getAppJSONObject(remoteAppId);

		jsonObject.put("cmd", "installApp");
		jsonObject.put("message", "success");

		writeJSON(actionRequest, actionResponse, jsonObject);
	}

	public void uninstallApp(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		long remoteAppId = ParamUtil.getLong(actionRequest, "appId");

		AppServiceUtil.uninstallApp(remoteAppId);

		JSONObject jsonObject = getAppJSONObject(remoteAppId);

		jsonObject.put("cmd", "uninstallApp");
		jsonObject.put("message", "success");

		writeJSON(actionRequest, actionResponse, jsonObject);
	}

	public void updateApp(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		long remoteAppId = ParamUtil.getLong(actionRequest, "appId");
		String version = ParamUtil.getString(actionRequest, "version");
		String url = ParamUtil.getString(actionRequest, "url");
		String orderUuid = ParamUtil.getString(actionRequest, "orderUuid");
		String productEntryName = ParamUtil.getString(
			actionRequest, "productEntryName");

		if (!url.startsWith(PortletPropsValues.MARKETPLACE_URL)) {
			JSONObject jsonObject = getAppJSONObject(remoteAppId);

			jsonObject.put("cmd", "downloadApp");
			jsonObject.put("message", "fail");

			writeJSON(actionRequest, actionResponse, jsonObject);

			return;
		}

		URL urlObj = new URL(url);

		File tempFile = null;

		try {
			InputStream inputStream = urlObj.openStream();

			tempFile = FileUtil.createTempFile();

			FileUtil.write(tempFile, inputStream);

			AppServiceUtil.updateApp(remoteAppId, version, tempFile);

			if (Validator.isNull(orderUuid) &&
				Validator.isNotNull(productEntryName)) {

				orderUuid = MarketplaceLicenseUtil.getOrder(productEntryName);
			}

			if (Validator.isNotNull(orderUuid)) {
				MarketplaceLicenseUtil.registerOrder(
					orderUuid, productEntryName);
			}

			AppServiceUtil.installApp(remoteAppId);

			JSONObject jsonObject = getAppJSONObject(remoteAppId);

			jsonObject.put("cmd", "updateApp");
			jsonObject.put("message", "success");

			writeJSON(actionRequest, actionResponse, jsonObject);
		}
		finally {
			if (tempFile != null) {
				tempFile.delete();
			}
		}
	}

	@Override
	protected boolean callActionMethod(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws PortletException {

		String cmd = ParamUtil.getString(actionRequest, Constants.CMD);

		if (Validator.isNull(cmd)) {
			return super.callActionMethod(actionRequest, actionResponse);
		}

		try {
			if (cmd.equals("downloadApp")) {
				downloadApp(actionRequest, actionResponse);
			}
			else if (cmd.equals("getApp")) {
				getApp(actionRequest, actionResponse);
			}
			else if (cmd.equals("getBundledApps")) {
				getBundledApps(actionRequest, actionResponse);
			}
			else if (cmd.equals("installApp")) {
				installApp(actionRequest, actionResponse);
			}
			else if (cmd.equals("updateApp")) {
				updateApp(actionRequest, actionResponse);
			}
			else if (cmd.equals("uninstallApp")) {
				uninstallApp(actionRequest, actionResponse);
			}
			else {
				return super.callActionMethod(actionRequest, actionResponse);
			}
		}
		catch (Exception e) {
			throw new PortletException(e);
		}

		return true;
	}

	@Override
	protected void doDispatch(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		try {
			ThemeDisplay themeDisplay =
				(ThemeDisplay)renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

			Token accessToken = OAuthUtil.getAccessToken(
				themeDisplay.getUser());

			if (accessToken == null) {
				include("/store/login.jsp", renderRequest, renderResponse);

				return;
			}
		}
		catch (Exception pe) {
			throw new PortletException(pe);
		}

		renderRequest.setAttribute(WebKeys.OAUTH_AUTHORIZED, Boolean.TRUE);

		super.doDispatch(renderRequest, renderResponse);
	}

	protected JSONObject getAppJSONObject(long remoteAppId) throws Exception {
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();

		App app = AppLocalServiceUtil.fetchRemoteApp(remoteAppId);

		if (app != null) {
			jsonObject.put("appId", app.getRemoteAppId());
			jsonObject.put("downloaded", app.isDownloaded());
			jsonObject.put("installed", app.isInstalled());
			jsonObject.put("version", app.getVersion());
		}
		else {
			jsonObject.put("appId", remoteAppId);
			jsonObject.put("downloaded", false);
			jsonObject.put("installed", false);
			jsonObject.put("version", StringPool.BLANK);
		}

		return jsonObject;
	}

	@Override
	protected String getServerPortletId() {
		return PortletPropsValues.MARKETPLACE_PORTLET_ID;
	}

	@Override
	protected String getServerPortletURL() {
		return PortletPropsValues.MARKETPLACE_URL + "/osb-portlet/mp_server";
	}

	@Override
	protected void processPortletParameterMap(
		PortletRequest portletRequest, PortletResponse portletResponse,
		Map<String, String[]> parameterMap) {

		parameterMap.put(
			"clientBuild",
			new String[] {String.valueOf(MarketplaceConstants.CLIENT_BUILD)});
		parameterMap.put(
			"compatibility",
			new String[] {String.valueOf(ReleaseInfo.getBuildNumber())});
		parameterMap.put(
			"supportsHotDeploy",
			new String[] {
				String.valueOf(ServerDetector.isSupportsHotDeploy())
			});
	}

}