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
 * The base model interface for the HRProjectStatus service. Represents a row in the &quot;HRProjectStatus&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.hr.model.impl.HRProjectStatusModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.hr.model.impl.HRProjectStatusImpl}.
 * </p>
 *
 * @author Wesley Gong
 * @see HRProjectStatus
 * @see com.liferay.hr.model.impl.HRProjectStatusImpl
 * @see com.liferay.hr.model.impl.HRProjectStatusModelImpl
 * @generated
 */
public interface HRProjectStatusModel extends BaseModel<HRProjectStatus>,
	GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a h r project status model instance should use the {@link HRProjectStatus} interface instead.
	 */

	/**
	 * Returns the primary key of this h r project status.
	 *
	 * @return the primary key of this h r project status
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this h r project status.
	 *
	 * @param primaryKey the primary key of this h r project status
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the hr project status ID of this h r project status.
	 *
	 * @return the hr project status ID of this h r project status
	 */
	public long getHrProjectStatusId();

	/**
	 * Sets the hr project status ID of this h r project status.
	 *
	 * @param hrProjectStatusId the hr project status ID of this h r project status
	 */
	public void setHrProjectStatusId(long hrProjectStatusId);

	/**
	 * Returns the group ID of this h r project status.
	 *
	 * @return the group ID of this h r project status
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this h r project status.
	 *
	 * @param groupId the group ID of this h r project status
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this h r project status.
	 *
	 * @return the company ID of this h r project status
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this h r project status.
	 *
	 * @param companyId the company ID of this h r project status
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this h r project status.
	 *
	 * @return the user ID of this h r project status
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this h r project status.
	 *
	 * @param userId the user ID of this h r project status
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this h r project status.
	 *
	 * @return the user uuid of this h r project status
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this h r project status.
	 *
	 * @param userUuid the user uuid of this h r project status
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this h r project status.
	 *
	 * @return the user name of this h r project status
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this h r project status.
	 *
	 * @param userName the user name of this h r project status
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this h r project status.
	 *
	 * @return the create date of this h r project status
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this h r project status.
	 *
	 * @param createDate the create date of this h r project status
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this h r project status.
	 *
	 * @return the modified date of this h r project status
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this h r project status.
	 *
	 * @param modifiedDate the modified date of this h r project status
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the code of this h r project status.
	 *
	 * @return the code of this h r project status
	 */
	@AutoEscape
	public String getCode();

	/**
	 * Sets the code of this h r project status.
	 *
	 * @param code the code of this h r project status
	 */
	public void setCode(String code);

	/**
	 * Returns the name of this h r project status.
	 *
	 * @return the name of this h r project status
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this h r project status.
	 *
	 * @param name the name of this h r project status
	 */
	public void setName(String name);

	/**
	 * Returns the description of this h r project status.
	 *
	 * @return the description of this h r project status
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this h r project status.
	 *
	 * @param description the description of this h r project status
	 */
	public void setDescription(String description);

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

	public int compareTo(HRProjectStatus hrProjectStatus);

	public int hashCode();

	public HRProjectStatus toEscapedModel();

	public String toString();

	public String toXmlString();
}