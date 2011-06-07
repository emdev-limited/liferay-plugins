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

import com.liferay.hr.model.HRProjectBillingRate;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the h r project billing rate service. This utility wraps {@link HRProjectBillingRatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Wesley Gong
 * @see HRProjectBillingRatePersistence
 * @see HRProjectBillingRatePersistenceImpl
 * @generated
 */
public class HRProjectBillingRateUtil {
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
	public static void clearCache(HRProjectBillingRate hrProjectBillingRate) {
		getPersistence().clearCache(hrProjectBillingRate);
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
	public static List<HRProjectBillingRate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HRProjectBillingRate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HRProjectBillingRate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static HRProjectBillingRate remove(
		HRProjectBillingRate hrProjectBillingRate) throws SystemException {
		return getPersistence().remove(hrProjectBillingRate);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static HRProjectBillingRate update(
		HRProjectBillingRate hrProjectBillingRate, boolean merge)
		throws SystemException {
		return getPersistence().update(hrProjectBillingRate, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static HRProjectBillingRate update(
		HRProjectBillingRate hrProjectBillingRate, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(hrProjectBillingRate, merge, serviceContext);
	}

	/**
	* Caches the h r project billing rate in the entity cache if it is enabled.
	*
	* @param hrProjectBillingRate the h r project billing rate
	*/
	public static void cacheResult(
		com.liferay.hr.model.HRProjectBillingRate hrProjectBillingRate) {
		getPersistence().cacheResult(hrProjectBillingRate);
	}

	/**
	* Caches the h r project billing rates in the entity cache if it is enabled.
	*
	* @param hrProjectBillingRates the h r project billing rates
	*/
	public static void cacheResult(
		java.util.List<com.liferay.hr.model.HRProjectBillingRate> hrProjectBillingRates) {
		getPersistence().cacheResult(hrProjectBillingRates);
	}

	/**
	* Creates a new h r project billing rate with the primary key. Does not add the h r project billing rate to the database.
	*
	* @param hrProjectBillingRateId the primary key for the new h r project billing rate
	* @return the new h r project billing rate
	*/
	public static com.liferay.hr.model.HRProjectBillingRate create(
		long hrProjectBillingRateId) {
		return getPersistence().create(hrProjectBillingRateId);
	}

	/**
	* Removes the h r project billing rate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param hrProjectBillingRateId the primary key of the h r project billing rate
	* @return the h r project billing rate that was removed
	* @throws com.liferay.hr.NoSuchProjectBillingRateException if a h r project billing rate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.hr.model.HRProjectBillingRate remove(
		long hrProjectBillingRateId)
		throws com.liferay.hr.NoSuchProjectBillingRateException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(hrProjectBillingRateId);
	}

	public static com.liferay.hr.model.HRProjectBillingRate updateImpl(
		com.liferay.hr.model.HRProjectBillingRate hrProjectBillingRate,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(hrProjectBillingRate, merge);
	}

	/**
	* Returns the h r project billing rate with the primary key or throws a {@link com.liferay.hr.NoSuchProjectBillingRateException} if it could not be found.
	*
	* @param hrProjectBillingRateId the primary key of the h r project billing rate
	* @return the h r project billing rate
	* @throws com.liferay.hr.NoSuchProjectBillingRateException if a h r project billing rate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.hr.model.HRProjectBillingRate findByPrimaryKey(
		long hrProjectBillingRateId)
		throws com.liferay.hr.NoSuchProjectBillingRateException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(hrProjectBillingRateId);
	}

	/**
	* Returns the h r project billing rate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param hrProjectBillingRateId the primary key of the h r project billing rate
	* @return the h r project billing rate, or <code>null</code> if a h r project billing rate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.hr.model.HRProjectBillingRate fetchByPrimaryKey(
		long hrProjectBillingRateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(hrProjectBillingRateId);
	}

	/**
	* Returns all the h r project billing rates.
	*
	* @return the h r project billing rates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.hr.model.HRProjectBillingRate> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the h r project billing rates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of h r project billing rates
	* @param end the upper bound of the range of h r project billing rates (not inclusive)
	* @return the range of h r project billing rates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.hr.model.HRProjectBillingRate> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the h r project billing rates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of h r project billing rates
	* @param end the upper bound of the range of h r project billing rates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of h r project billing rates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.hr.model.HRProjectBillingRate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the h r project billing rates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of h r project billing rates.
	*
	* @return the number of h r project billing rates
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static HRProjectBillingRatePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (HRProjectBillingRatePersistence)PortletBeanLocatorUtil.locate(com.liferay.hr.service.ClpSerializer.getServletContextName(),
					HRProjectBillingRatePersistence.class.getName());

			ReferenceRegistry.registerReference(HRProjectBillingRateUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(HRProjectBillingRatePersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(HRProjectBillingRateUtil.class,
			"_persistence");
	}

	private static HRProjectBillingRatePersistence _persistence;
}