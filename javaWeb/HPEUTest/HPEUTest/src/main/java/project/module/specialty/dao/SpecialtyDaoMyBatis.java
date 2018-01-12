/*****************************************************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*****************************************************************************/
package project.module.specialty.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import project.core.MyBatisRepository;
import project.dto.SpecialtyDTO;

@MyBatisRepository
public interface SpecialtyDaoMyBatis {
	
	/**
	 * 获取角色列表
	 * @return
	 */
	List<SpecialtyDTO> getSpecialtys();
	
	/**
	 * 获取角色基本信息列表
	 * @return
	 */
	List<SpecialtyDTO> getSimpleSpecialtys();
	
	/**
	 * 根据id获取角色
	 * @param specialtyId
	 * @return
	 */
	SpecialtyDTO getSpecialty(@Param("specialtyId") Long specialtyId);
	
}
