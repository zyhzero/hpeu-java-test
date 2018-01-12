/*****************************************************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*****************************************************************************/
package online.shixun.asl.module.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import online.shixun.asl.dto.UserDTO;
import online.shixun.asl.module.user.dao.UserDaoMyBatis;

@Service
public class UserServiceImpl {
	
	@Autowired
	private UserDaoMyBatis userDao;
	

	/**
	 * 获取用户列表
	 * @return
	 */
	public List<UserDTO> getUsers() {
		return userDao.getUsers();
	}
	
	public List<UserDTO> getJavaUsers() {
		return userDao.getJavaUsers();
	}
	
	public List<UserDTO> getWebUsers() {
		return userDao.getWebUsers();
	}
	
	public List<UserDTO> getBigDataUsers() {
		return userDao.getBigDataUsers();
	}
	
	public List<UserDTO> getMathUsers() {
		return userDao.getMathUsers();
	}
	
	public List<UserDTO> getMaleUsers() {
		return userDao.getMathUsers();
	}
	
	public List<UserDTO> getFemaleUsers() {
		return userDao.getMathUsers();
	}
	
	/**
	 * 根据用户id获取用户信息
	 * @param userId
	 * @return
	 */
	/*public UserDTO getUser(Long userId) {
		if (userId == -1L) {
			return new UserDTO();
		}
		
		return userDao.getUser(userId);
	}*/
	
	/**
	 * 新增或更新用户
	 * @param user
	 */
	@Transactional
	public void saveOrUpdateUser(UserDTO user) {
		// 新增并填充id
		userDao.saveOrUpdateUser(user);
		
//		// 获取部门编码
//		String code = departmentService.getDepartmentCode(user.getDepartment().getId());
//		
//		// 根据用户id和部门code，更新用户code
//		userDao.updateUserCode(user.getId(), code + "-" + user.getId());
	}

	
}
