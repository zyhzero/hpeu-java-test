/*****************************************************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*****************************************************************************/
package project.module.specialty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import project.dto.SpecialtyDTO;
import project.module.direction.service.DirectionServiceImpl;
import project.module.specialty.dao.SpecialtyDaoMyBatis;

@Service
public class SpecialtyServiceImpl {
	
	@Autowired
	private SpecialtyDaoMyBatis specialtyDao;
	
	@Autowired
	private DirectionServiceImpl jurisdictionService;
	
	/**
	 * 获取角色列表
	 * @return
	 */
	public List<SpecialtyDTO> getSpecialtys() {
		return specialtyDao.getSpecialtys();
	}
	
	/**
	 * 获取角色基本信息列表
	 * @return
	 */
	public List<SpecialtyDTO> getSimpleSpecialtys() {
		return specialtyDao.getSimpleSpecialtys();
	}
	
	/**
	 * 根据id获取角色
	 * @param specialtyId
	 * @return
	 */
	public SpecialtyDTO getSpecialty(Long specialtyId) {
		return specialtyDao.getSpecialty(specialtyId);
	}
	
	/**
	 * 获取角色完整信息
	 * @param specialtyId
	 * @return
	 *//*
	public SpecialtyDTO getFullSpecialty(Long specialtyId) {
		// 获取角色信息
		SpecialtyDTO specialty = getSpecialty(specialtyId);
		
		// 新增时没有角色信息
		if (specialty == null) {
			return new SpecialtyDTO();
		}
		
		// 填充角色权限关联
		specialty.setJurisdictions(jurisdictionService.getSpecialtyJurisdictions(specialtyId));
		
		return specialty;
	}*/
	
	
}
