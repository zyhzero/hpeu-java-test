/*****************************************************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*****************************************************************************/
package project.module.direction.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import project.core.MyBatisRepository;
import project.dto.DirectionDTO;

@MyBatisRepository
public interface DirectionDaoMyBatis {

	/**
	 * 获取权限列表
	 * @return
	 */
	List<DirectionDTO> getDirections();
	
	/**
	 * 获取权限基本信息列表
	 * @return
	 */
	List<DirectionDTO> getSimpleDirections();
	
	/**
	 * 通过角色id获取角色权限关联
	 * @param specialtyId
	 * @return
	 */
	List<DirectionDTO> getSpecialtyDirections(@Param("specialtyId") Long specialtyId);
	
	/**
	 * 根据id获取权限
	 * @param id
	 * @return
	 */
	DirectionDTO getDirection(@Param("id") Long id);
	
	
}
