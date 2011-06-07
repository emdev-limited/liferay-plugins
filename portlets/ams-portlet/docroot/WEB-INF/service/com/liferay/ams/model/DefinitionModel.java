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

package com.liferay.ams.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Definition service. Represents a row in the &quot;AMS_Definition&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.ams.model.impl.DefinitionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.ams.model.impl.DefinitionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Definition
 * @see com.liferay.ams.model.impl.DefinitionImpl
 * @see com.liferay.ams.model.impl.DefinitionModelImpl
 * @generated
 */
public interface DefinitionModel extends BaseModel<Definition>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a definition model instance should use the {@link Definition} interface instead.
	 */

	/**
	 * Returns the primary key of this definition.
	 *
	 * @return the primary key of this definition
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this definition.
	 *
	 * @param primaryKey the primary key of this definition
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the definition ID of this definition.
	 *
	 * @return the definition ID of this definition
	 */
	public long getDefinitionId();

	/**
	 * Sets the definition ID of this definition.
	 *
	 * @param definitionId the definition ID of this definition
	 */
	public void setDefinitionId(long definitionId);

	/**
	 * Returns the group ID of this definition.
	 *
	 * @return the group ID of this definition
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this definition.
	 *
	 * @param groupId the group ID of this definition
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this definition.
	 *
	 * @return the company ID of this definition
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this definition.
	 *
	 * @param companyId the company ID of this definition
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this definition.
	 *
	 * @return the user ID of this definition
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this definition.
	 *
	 * @param userId the user ID of this definition
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this definition.
	 *
	 * @return the user uuid of this definition
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this definition.
	 *
	 * @param userUuid the user uuid of this definition
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this definition.
	 *
	 * @return the user name of this definition
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this definition.
	 *
	 * @param userName the user name of this definition
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this definition.
	 *
	 * @return the create date of this definition
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this definition.
	 *
	 * @param createDate the create date of this definition
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this definition.
	 *
	 * @return the modified date of this definition
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this definition.
	 *
	 * @param modifiedDate the modified date of this definition
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the type ID of this definition.
	 *
	 * @return the type ID of this definition
	 */
	public long getTypeId();

	/**
	 * Sets the type ID of this definition.
	 *
	 * @param typeId the type ID of this definition
	 */
	public void setTypeId(long typeId);

	/**
	 * Returns the manufacturer of this definition.
	 *
	 * @return the manufacturer of this definition
	 */
	@AutoEscape
	public String getManufacturer();

	/**
	 * Sets the manufacturer of this definition.
	 *
	 * @param manufacturer the manufacturer of this definition
	 */
	public void setManufacturer(String manufacturer);

	/**
	 * Returns the model of this definition.
	 *
	 * @return the model of this definition
	 */
	@AutoEscape
	public String getModel();

	/**
	 * Sets the model of this definition.
	 *
	 * @param model the model of this definition
	 */
	public void setModel(String model);

	/**
	 * Returns the order date of this definition.
	 *
	 * @return the order date of this definition
	 */
	public Date getOrderDate();

	/**
	 * Sets the order date of this definition.
	 *
	 * @param orderDate the order date of this definition
	 */
	public void setOrderDate(Date orderDate);

	/**
	 * Returns the quantity of this definition.
	 *
	 * @return the quantity of this definition
	 */
	public int getQuantity();

	/**
	 * Sets the quantity of this definition.
	 *
	 * @param quantity the quantity of this definition
	 */
	public void setQuantity(int quantity);

	/**
	 * Returns the price of this definition.
	 *
	 * @return the price of this definition
	 */
	public double getPrice();

	/**
	 * Sets the price of this definition.
	 *
	 * @param price the price of this definition
	 */
	public void setPrice(double price);

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

	public int compareTo(Definition definition);

	public int hashCode();

	public Definition toEscapedModel();

	public String toString();

	public String toXmlString();
}