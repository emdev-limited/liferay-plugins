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
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the HRUserTimeOff service. Represents a row in the &quot;HRUserTimeOff&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.hr.model.impl.HRUserTimeOffModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.hr.model.impl.HRUserTimeOffImpl}.
 * </p>
 *
 * @author Wesley Gong
 * @see HRUserTimeOff
 * @see com.liferay.hr.model.impl.HRUserTimeOffImpl
 * @see com.liferay.hr.model.impl.HRUserTimeOffModelImpl
 * @generated
 */
public interface HRUserTimeOffModel extends BaseModel<HRUserTimeOff>,
	GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a h r user time off model instance should use the {@link HRUserTimeOff} interface instead.
	 */

	/**
	 * Returns the primary key of this h r user time off.
	 *
	 * @return the primary key of this h r user time off
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this h r user time off.
	 *
	 * @param primaryKey the primary key of this h r user time off
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the hr user time off ID of this h r user time off.
	 *
	 * @return the hr user time off ID of this h r user time off
	 */
	public long getHrUserTimeOffId();

	/**
	 * Sets the hr user time off ID of this h r user time off.
	 *
	 * @param hrUserTimeOffId the hr user time off ID of this h r user time off
	 */
	public void setHrUserTimeOffId(long hrUserTimeOffId);

	/**
	 * Returns the group ID of this h r user time off.
	 *
	 * @return the group ID of this h r user time off
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this h r user time off.
	 *
	 * @param groupId the group ID of this h r user time off
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this h r user time off.
	 *
	 * @return the company ID of this h r user time off
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this h r user time off.
	 *
	 * @param companyId the company ID of this h r user time off
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this h r user time off.
	 *
	 * @return the user ID of this h r user time off
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this h r user time off.
	 *
	 * @param userId the user ID of this h r user time off
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this h r user time off.
	 *
	 * @return the user uuid of this h r user time off
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this h r user time off.
	 *
	 * @param userUuid the user uuid of this h r user time off
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this h r user time off.
	 *
	 * @return the user name of this h r user time off
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this h r user time off.
	 *
	 * @param userName the user name of this h r user time off
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this h r user time off.
	 *
	 * @return the create date of this h r user time off
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this h r user time off.
	 *
	 * @param createDate the create date of this h r user time off
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this h r user time off.
	 *
	 * @return the modified date of this h r user time off
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this h r user time off.
	 *
	 * @param modifiedDate the modified date of this h r user time off
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the hr time off type ID of this h r user time off.
	 *
	 * @return the hr time off type ID of this h r user time off
	 */
	public long getHrTimeOffTypeId();

	/**
	 * Sets the hr time off type ID of this h r user time off.
	 *
	 * @param hrTimeOffTypeId the hr time off type ID of this h r user time off
	 */
	public void setHrTimeOffTypeId(long hrTimeOffTypeId);

	/**
	 * Returns the hr user ID of this h r user time off.
	 *
	 * @return the hr user ID of this h r user time off
	 */
	public long getHrUserId();

	/**
	 * Sets the hr user ID of this h r user time off.
	 *
	 * @param hrUserId the hr user ID of this h r user time off
	 */
	public void setHrUserId(long hrUserId);

	/**
	 * Returns the hr user uuid of this h r user time off.
	 *
	 * @return the hr user uuid of this h r user time off
	 * @throws SystemException if a system exception occurred
	 */
	public String getHrUserUuid() throws SystemException;

	/**
	 * Sets the hr user uuid of this h r user time off.
	 *
	 * @param hrUserUuid the hr user uuid of this h r user time off
	 */
	public void setHrUserUuid(String hrUserUuid);

	/**
	 * Returns the year of this h r user time off.
	 *
	 * @return the year of this h r user time off
	 */
	public int getYear();

	/**
	 * Sets the year of this h r user time off.
	 *
	 * @param year the year of this h r user time off
	 */
	public void setYear(int year);

	/**
	 * Returns the hours allowed of this h r user time off.
	 *
	 * @return the hours allowed of this h r user time off
	 */
	public double getHoursAllowed();

	/**
	 * Sets the hours allowed of this h r user time off.
	 *
	 * @param hoursAllowed the hours allowed of this h r user time off
	 */
	public void setHoursAllowed(double hoursAllowed);

	/**
	 * Returns the hours accrued of this h r user time off.
	 *
	 * @return the hours accrued of this h r user time off
	 */
	public double getHoursAccrued();

	/**
	 * Sets the hours accrued of this h r user time off.
	 *
	 * @param hoursAccrued the hours accrued of this h r user time off
	 */
	public void setHoursAccrued(double hoursAccrued);

	/**
	 * Returns the hours carried over of this h r user time off.
	 *
	 * @return the hours carried over of this h r user time off
	 */
	public double getHoursCarriedOver();

	/**
	 * Sets the hours carried over of this h r user time off.
	 *
	 * @param hoursCarriedOver the hours carried over of this h r user time off
	 */
	public void setHoursCarriedOver(double hoursCarriedOver);

	/**
	 * Returns the hours used of this h r user time off.
	 *
	 * @return the hours used of this h r user time off
	 */
	public double getHoursUsed();

	/**
	 * Sets the hours used of this h r user time off.
	 *
	 * @param hoursUsed the hours used of this h r user time off
	 */
	public void setHoursUsed(double hoursUsed);

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

	public int compareTo(HRUserTimeOff hrUserTimeOff);

	public int hashCode();

	public HRUserTimeOff toEscapedModel();

	public String toString();

	public String toXmlString();
}