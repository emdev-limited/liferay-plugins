/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.hr.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.model.WorkflowedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the HRTimeOff service. Represents a row in the &quot;HRTimeOff&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.hr.model.impl.HRTimeOffModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.hr.model.impl.HRTimeOffImpl}.
 * </p>
 *
 * @author Wesley Gong
 * @see HRTimeOff
 * @see com.liferay.hr.model.impl.HRTimeOffImpl
 * @see com.liferay.hr.model.impl.HRTimeOffModelImpl
 * @generated
 */
public interface HRTimeOffModel extends BaseModel<HRTimeOff>, GroupedModel,
	WorkflowedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a h r time off model instance should use the {@link HRTimeOff} interface instead.
	 */

	/**
	 * Returns the primary key of this h r time off.
	 *
	 * @return the primary key of this h r time off
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this h r time off.
	 *
	 * @param primaryKey the primary key of this h r time off
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the hr time off ID of this h r time off.
	 *
	 * @return the hr time off ID of this h r time off
	 */
	public long getHrTimeOffId();

	/**
	 * Sets the hr time off ID of this h r time off.
	 *
	 * @param hrTimeOffId the hr time off ID of this h r time off
	 */
	public void setHrTimeOffId(long hrTimeOffId);

	/**
	 * Returns the group ID of this h r time off.
	 *
	 * @return the group ID of this h r time off
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this h r time off.
	 *
	 * @param groupId the group ID of this h r time off
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this h r time off.
	 *
	 * @return the company ID of this h r time off
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this h r time off.
	 *
	 * @param companyId the company ID of this h r time off
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this h r time off.
	 *
	 * @return the user ID of this h r time off
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this h r time off.
	 *
	 * @param userId the user ID of this h r time off
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this h r time off.
	 *
	 * @return the user uuid of this h r time off
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this h r time off.
	 *
	 * @param userUuid the user uuid of this h r time off
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this h r time off.
	 *
	 * @return the user name of this h r time off
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this h r time off.
	 *
	 * @param userName the user name of this h r time off
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this h r time off.
	 *
	 * @return the create date of this h r time off
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this h r time off.
	 *
	 * @param createDate the create date of this h r time off
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this h r time off.
	 *
	 * @return the modified date of this h r time off
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this h r time off.
	 *
	 * @param modifiedDate the modified date of this h r time off
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the hr time off type ID of this h r time off.
	 *
	 * @return the hr time off type ID of this h r time off
	 */
	public long getHrTimeOffTypeId();

	/**
	 * Sets the hr time off type ID of this h r time off.
	 *
	 * @param hrTimeOffTypeId the hr time off type ID of this h r time off
	 */
	public void setHrTimeOffTypeId(long hrTimeOffTypeId);

	/**
	 * Returns the hr time sheet ID of this h r time off.
	 *
	 * @return the hr time sheet ID of this h r time off
	 */
	public long getHrTimeSheetId();

	/**
	 * Sets the hr time sheet ID of this h r time off.
	 *
	 * @param hrTimeSheetId the hr time sheet ID of this h r time off
	 */
	public void setHrTimeSheetId(long hrTimeSheetId);

	/**
	 * Returns the hr user ID of this h r time off.
	 *
	 * @return the hr user ID of this h r time off
	 */
	public long getHrUserId();

	/**
	 * Sets the hr user ID of this h r time off.
	 *
	 * @param hrUserId the hr user ID of this h r time off
	 */
	public void setHrUserId(long hrUserId);

	/**
	 * Returns the hr user uuid of this h r time off.
	 *
	 * @return the hr user uuid of this h r time off
	 * @throws SystemException if a system exception occurred
	 */
	public String getHrUserUuid() throws SystemException;

	/**
	 * Sets the hr user uuid of this h r time off.
	 *
	 * @param hrUserUuid the hr user uuid of this h r time off
	 */
	public void setHrUserUuid(String hrUserUuid);

	/**
	 * Returns the start day of year of this h r time off.
	 *
	 * @return the start day of year of this h r time off
	 */
	public int getStartDayOfYear();

	/**
	 * Sets the start day of year of this h r time off.
	 *
	 * @param startDayOfYear the start day of year of this h r time off
	 */
	public void setStartDayOfYear(int startDayOfYear);

	/**
	 * Returns the end day of year of this h r time off.
	 *
	 * @return the end day of year of this h r time off
	 */
	public int getEndDayOfYear();

	/**
	 * Sets the end day of year of this h r time off.
	 *
	 * @param endDayOfYear the end day of year of this h r time off
	 */
	public void setEndDayOfYear(int endDayOfYear);

	/**
	 * Returns the year of this h r time off.
	 *
	 * @return the year of this h r time off
	 */
	public int getYear();

	/**
	 * Sets the year of this h r time off.
	 *
	 * @param year the year of this h r time off
	 */
	public void setYear(int year);

	/**
	 * Returns the total hours of this h r time off.
	 *
	 * @return the total hours of this h r time off
	 */
	public double getTotalHours();

	/**
	 * Sets the total hours of this h r time off.
	 *
	 * @param totalHours the total hours of this h r time off
	 */
	public void setTotalHours(double totalHours);

	/**
	 * Returns the status of this h r time off.
	 *
	 * @return the status of this h r time off
	 */
	public int getStatus();

	/**
	 * Sets the status of this h r time off.
	 *
	 * @param status the status of this h r time off
	 */
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this h r time off.
	 *
	 * @return the status by user ID of this h r time off
	 */
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this h r time off.
	 *
	 * @param statusByUserId the status by user ID of this h r time off
	 */
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this h r time off.
	 *
	 * @return the status by user uuid of this h r time off
	 * @throws SystemException if a system exception occurred
	 */
	public String getStatusByUserUuid() throws SystemException;

	/**
	 * Sets the status by user uuid of this h r time off.
	 *
	 * @param statusByUserUuid the status by user uuid of this h r time off
	 */
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this h r time off.
	 *
	 * @return the status by user name of this h r time off
	 */
	@AutoEscape
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this h r time off.
	 *
	 * @param statusByUserName the status by user name of this h r time off
	 */
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this h r time off.
	 *
	 * @return the status date of this h r time off
	 */
	public Date getStatusDate();

	/**
	 * Sets the status date of this h r time off.
	 *
	 * @param statusDate the status date of this h r time off
	 */
	public void setStatusDate(Date statusDate);

	/**
	 * @deprecated Renamed to {@link #isApproved()}
	 */
	public boolean getApproved();

	/**
	 * Determines if this h r time off is approved.
	 *
	 * @return <code>true</code> if this h r time off is approved; <code>false</code> otherwise
	 */
	public boolean isApproved();

	/**
	 * Determines if this h r time off is a draft.
	 *
	 * @return <code>true</code> if this h r time off is a draft; <code>false</code> otherwise
	 */
	public boolean isDraft();

	/**
	 * Determines if this h r time off is expired.
	 *
	 * @return <code>true</code> if this h r time off is expired; <code>false</code> otherwise
	 */
	public boolean isExpired();

	/**
	 * Determines if this h r time off is pending.
	 *
	 * @return <code>true</code> if this h r time off is pending; <code>false</code> otherwise
	 */
	public boolean isPending();

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(HRTimeOff hrTimeOff);

	public int hashCode();

	public HRTimeOff toEscapedModel();

	public String toString();

	public String toXmlString();
}