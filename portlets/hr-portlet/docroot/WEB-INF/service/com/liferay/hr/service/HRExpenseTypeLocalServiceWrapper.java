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

package com.liferay.hr.service;

/**
 * <p>
 * This class is a wrapper for {@link HRExpenseTypeLocalService}.
 * </p>
 *
 * @author    Wesley Gong
 * @see       HRExpenseTypeLocalService
 * @generated
 */
public class HRExpenseTypeLocalServiceWrapper
	implements HRExpenseTypeLocalService {
	public HRExpenseTypeLocalServiceWrapper(
		HRExpenseTypeLocalService hrExpenseTypeLocalService) {
		_hrExpenseTypeLocalService = hrExpenseTypeLocalService;
	}

	/**
	* Adds the h r expense type to the database. Also notifies the appropriate model listeners.
	*
	* @param hrExpenseType the h r expense type
	* @return the h r expense type that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.hr.model.HRExpenseType addHRExpenseType(
		com.liferay.hr.model.HRExpenseType hrExpenseType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hrExpenseTypeLocalService.addHRExpenseType(hrExpenseType);
	}

	/**
	* Creates a new h r expense type with the primary key. Does not add the h r expense type to the database.
	*
	* @param hrExpenseTypeId the primary key for the new h r expense type
	* @return the new h r expense type
	*/
	public com.liferay.hr.model.HRExpenseType createHRExpenseType(
		long hrExpenseTypeId) {
		return _hrExpenseTypeLocalService.createHRExpenseType(hrExpenseTypeId);
	}

	/**
	* Deletes the h r expense type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param hrExpenseTypeId the primary key of the h r expense type
	* @throws PortalException if a h r expense type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteHRExpenseType(long hrExpenseTypeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_hrExpenseTypeLocalService.deleteHRExpenseType(hrExpenseTypeId);
	}

	/**
	* Deletes the h r expense type from the database. Also notifies the appropriate model listeners.
	*
	* @param hrExpenseType the h r expense type
	* @throws SystemException if a system exception occurred
	*/
	public void deleteHRExpenseType(
		com.liferay.hr.model.HRExpenseType hrExpenseType)
		throws com.liferay.portal.kernel.exception.SystemException {
		_hrExpenseTypeLocalService.deleteHRExpenseType(hrExpenseType);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hrExpenseTypeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _hrExpenseTypeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hrExpenseTypeLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hrExpenseTypeLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the h r expense type with the primary key.
	*
	* @param hrExpenseTypeId the primary key of the h r expense type
	* @return the h r expense type
	* @throws PortalException if a h r expense type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.hr.model.HRExpenseType getHRExpenseType(
		long hrExpenseTypeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _hrExpenseTypeLocalService.getHRExpenseType(hrExpenseTypeId);
	}

	/**
	* Returns a range of all the h r expense types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of h r expense types
	* @param end the upper bound of the range of h r expense types (not inclusive)
	* @return the range of h r expense types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.hr.model.HRExpenseType> getHRExpenseTypes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hrExpenseTypeLocalService.getHRExpenseTypes(start, end);
	}

	/**
	* Returns the number of h r expense types.
	*
	* @return the number of h r expense types
	* @throws SystemException if a system exception occurred
	*/
	public int getHRExpenseTypesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hrExpenseTypeLocalService.getHRExpenseTypesCount();
	}

	/**
	* Updates the h r expense type in the database. Also notifies the appropriate model listeners.
	*
	* @param hrExpenseType the h r expense type
	* @return the h r expense type that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.hr.model.HRExpenseType updateHRExpenseType(
		com.liferay.hr.model.HRExpenseType hrExpenseType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hrExpenseTypeLocalService.updateHRExpenseType(hrExpenseType);
	}

	/**
	* Updates the h r expense type in the database. Also notifies the appropriate model listeners.
	*
	* @param hrExpenseType the h r expense type
	* @param merge whether to merge the h r expense type with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the h r expense type that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.hr.model.HRExpenseType updateHRExpenseType(
		com.liferay.hr.model.HRExpenseType hrExpenseType, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hrExpenseTypeLocalService.updateHRExpenseType(hrExpenseType,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _hrExpenseTypeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_hrExpenseTypeLocalService.setBeanIdentifier(beanIdentifier);
	}

	public HRExpenseTypeLocalService getWrappedHRExpenseTypeLocalService() {
		return _hrExpenseTypeLocalService;
	}

	public void setWrappedHRExpenseTypeLocalService(
		HRExpenseTypeLocalService hrExpenseTypeLocalService) {
		_hrExpenseTypeLocalService = hrExpenseTypeLocalService;
	}

	private HRExpenseTypeLocalService _hrExpenseTypeLocalService;
}