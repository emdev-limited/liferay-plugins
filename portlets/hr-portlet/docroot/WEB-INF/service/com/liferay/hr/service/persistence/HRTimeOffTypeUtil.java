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

package com.liferay.hr.service.persistence;

import com.liferay.hr.model.HRTimeOffType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the h r time off type service. This utility wraps {@link HRTimeOffTypePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Wesley Gong
 * @see HRTimeOffTypePersistence
 * @see HRTimeOffTypePersistenceImpl
 * @generated
 */
public class HRTimeOffTypeUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(HRTimeOffType hrTimeOffType) {
		getPersistence().clearCache(hrTimeOffType);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HRTimeOffType> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HRTimeOffType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HRTimeOffType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static HRTimeOffType remove(HRTimeOffType hrTimeOffType)
		throws SystemException {
		return getPersistence().remove(hrTimeOffType);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static HRTimeOffType update(HRTimeOffType hrTimeOffType,
		boolean merge) throws SystemException {
		return getPersistence().update(hrTimeOffType, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static HRTimeOffType update(HRTimeOffType hrTimeOffType,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(hrTimeOffType, merge, serviceContext);
	}

	/**
	* Caches the h r time off type in the entity cache if it is enabled.
	*
	* @param hrTimeOffType the h r time off type
	*/
	public static void cacheResult(
		com.liferay.hr.model.HRTimeOffType hrTimeOffType) {
		getPersistence().cacheResult(hrTimeOffType);
	}

	/**
	* Caches the h r time off types in the entity cache if it is enabled.
	*
	* @param hrTimeOffTypes the h r time off types
	*/
	public static void cacheResult(
		java.util.List<com.liferay.hr.model.HRTimeOffType> hrTimeOffTypes) {
		getPersistence().cacheResult(hrTimeOffTypes);
	}

	/**
	* Creates a new h r time off type with the primary key. Does not add the h r time off type to the database.
	*
	* @param hrTimeOffTypeId the primary key for the new h r time off type
	* @return the new h r time off type
	*/
	public static com.liferay.hr.model.HRTimeOffType create(
		long hrTimeOffTypeId) {
		return getPersistence().create(hrTimeOffTypeId);
	}

	/**
	* Removes the h r time off type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param hrTimeOffTypeId the primary key of the h r time off type
	* @return the h r time off type that was removed
	* @throws com.liferay.hr.NoSuchTimeOffTypeException if a h r time off type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.hr.model.HRTimeOffType remove(
		long hrTimeOffTypeId)
		throws com.liferay.hr.NoSuchTimeOffTypeException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(hrTimeOffTypeId);
	}

	public static com.liferay.hr.model.HRTimeOffType updateImpl(
		com.liferay.hr.model.HRTimeOffType hrTimeOffType, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(hrTimeOffType, merge);
	}

	/**
	* Returns the h r time off type with the primary key or throws a {@link com.liferay.hr.NoSuchTimeOffTypeException} if it could not be found.
	*
	* @param hrTimeOffTypeId the primary key of the h r time off type
	* @return the h r time off type
	* @throws com.liferay.hr.NoSuchTimeOffTypeException if a h r time off type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.hr.model.HRTimeOffType findByPrimaryKey(
		long hrTimeOffTypeId)
		throws com.liferay.hr.NoSuchTimeOffTypeException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(hrTimeOffTypeId);
	}

	/**
	* Returns the h r time off type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param hrTimeOffTypeId the primary key of the h r time off type
	* @return the h r time off type, or <code>null</code> if a h r time off type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.hr.model.HRTimeOffType fetchByPrimaryKey(
		long hrTimeOffTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(hrTimeOffTypeId);
	}

	/**
	* Returns all the h r time off types.
	*
	* @return the h r time off types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.hr.model.HRTimeOffType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the h r time off types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of h r time off types
	* @param end the upper bound of the range of h r time off types (not inclusive)
	* @return the range of h r time off types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.hr.model.HRTimeOffType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the h r time off types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of h r time off types
	* @param end the upper bound of the range of h r time off types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of h r time off types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.hr.model.HRTimeOffType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the h r time off types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of h r time off types.
	*
	* @return the number of h r time off types
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static HRTimeOffTypePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (HRTimeOffTypePersistence)PortletBeanLocatorUtil.locate(com.liferay.hr.service.ClpSerializer.getServletContextName(),
					HRTimeOffTypePersistence.class.getName());

			ReferenceRegistry.registerReference(HRTimeOffTypeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(HRTimeOffTypePersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(HRTimeOffTypeUtil.class,
			"_persistence");
	}

	private static HRTimeOffTypePersistence _persistence;
}