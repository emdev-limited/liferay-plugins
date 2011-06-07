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

import com.liferay.hr.model.HRUserProject;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the h r user project service. This utility wraps {@link HRUserProjectPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Wesley Gong
 * @see HRUserProjectPersistence
 * @see HRUserProjectPersistenceImpl
 * @generated
 */
public class HRUserProjectUtil {
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
	public static void clearCache(HRUserProject hrUserProject) {
		getPersistence().clearCache(hrUserProject);
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
	public static List<HRUserProject> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HRUserProject> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HRUserProject> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static HRUserProject remove(HRUserProject hrUserProject)
		throws SystemException {
		return getPersistence().remove(hrUserProject);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static HRUserProject update(HRUserProject hrUserProject,
		boolean merge) throws SystemException {
		return getPersistence().update(hrUserProject, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static HRUserProject update(HRUserProject hrUserProject,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(hrUserProject, merge, serviceContext);
	}

	/**
	* Caches the h r user project in the entity cache if it is enabled.
	*
	* @param hrUserProject the h r user project
	*/
	public static void cacheResult(
		com.liferay.hr.model.HRUserProject hrUserProject) {
		getPersistence().cacheResult(hrUserProject);
	}

	/**
	* Caches the h r user projects in the entity cache if it is enabled.
	*
	* @param hrUserProjects the h r user projects
	*/
	public static void cacheResult(
		java.util.List<com.liferay.hr.model.HRUserProject> hrUserProjects) {
		getPersistence().cacheResult(hrUserProjects);
	}

	/**
	* Creates a new h r user project with the primary key. Does not add the h r user project to the database.
	*
	* @param hrUserProjectId the primary key for the new h r user project
	* @return the new h r user project
	*/
	public static com.liferay.hr.model.HRUserProject create(
		long hrUserProjectId) {
		return getPersistence().create(hrUserProjectId);
	}

	/**
	* Removes the h r user project with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param hrUserProjectId the primary key of the h r user project
	* @return the h r user project that was removed
	* @throws com.liferay.hr.NoSuchUserProjectException if a h r user project with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.hr.model.HRUserProject remove(
		long hrUserProjectId)
		throws com.liferay.hr.NoSuchUserProjectException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(hrUserProjectId);
	}

	public static com.liferay.hr.model.HRUserProject updateImpl(
		com.liferay.hr.model.HRUserProject hrUserProject, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(hrUserProject, merge);
	}

	/**
	* Returns the h r user project with the primary key or throws a {@link com.liferay.hr.NoSuchUserProjectException} if it could not be found.
	*
	* @param hrUserProjectId the primary key of the h r user project
	* @return the h r user project
	* @throws com.liferay.hr.NoSuchUserProjectException if a h r user project with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.hr.model.HRUserProject findByPrimaryKey(
		long hrUserProjectId)
		throws com.liferay.hr.NoSuchUserProjectException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(hrUserProjectId);
	}

	/**
	* Returns the h r user project with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param hrUserProjectId the primary key of the h r user project
	* @return the h r user project, or <code>null</code> if a h r user project with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.hr.model.HRUserProject fetchByPrimaryKey(
		long hrUserProjectId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(hrUserProjectId);
	}

	/**
	* Returns all the h r user projects.
	*
	* @return the h r user projects
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.hr.model.HRUserProject> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the h r user projects.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of h r user projects
	* @param end the upper bound of the range of h r user projects (not inclusive)
	* @return the range of h r user projects
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.hr.model.HRUserProject> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the h r user projects.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of h r user projects
	* @param end the upper bound of the range of h r user projects (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of h r user projects
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.hr.model.HRUserProject> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the h r user projects from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of h r user projects.
	*
	* @return the number of h r user projects
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static HRUserProjectPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (HRUserProjectPersistence)PortletBeanLocatorUtil.locate(com.liferay.hr.service.ClpSerializer.getServletContextName(),
					HRUserProjectPersistence.class.getName());

			ReferenceRegistry.registerReference(HRUserProjectUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(HRUserProjectPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(HRUserProjectUtil.class,
			"_persistence");
	}

	private static HRUserProjectPersistence _persistence;
}