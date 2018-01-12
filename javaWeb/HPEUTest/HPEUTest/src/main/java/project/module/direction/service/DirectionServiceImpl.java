/*****************************************************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*****************************************************************************/
package project.module.direction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import project.core.ResponseData;
import project.dto.DirectionDTO;
import project.module.direction.dao.DirectionDaoMyBatis;
import project.module.specialty.service.SpecialtyServiceImpl;

@Service
public class DirectionServiceImpl {

	@Autowired
	private DirectionDaoMyBatis directionDao;
	
	@Autowired
	private SpecialtyServiceImpl specialtyService;

	/**
	 * 获取权限列表
	 * @return
	 */
	@Cacheable(value = "directionService")
	public List<DirectionDTO> getDirections() {
		return directionDao.getDirections();
	}
	
	/**
	 * 获取权限基本信息列表
	 * @return
	 */
	public List<DirectionDTO> getSimpleDirections() {
		return directionDao.getSimpleDirections();
	}
	
	/**
	 * 通过角色id获取角色权限关联
	 * @param specialtyId
	 * @return
	 */
	public List<DirectionDTO> getRoleDirections(Long specialtyId) {
		return directionDao.getSpecialtyDirections(specialtyId);
	}


	/**
	 * 根据id获取权限
	 * @param id
	 * @return
	 */
	@Cacheable(value = "directionService")
	public DirectionDTO getDirection(Long id) {
		// 有效性验证
		if (id == -1L) {
			return new DirectionDTO();
		}

		return directionDao.getDirection(id);
	}


	

}
