/*****************************************************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*****************************************************************************/
package project.module.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import project.core.MyBatisRepository;
import project.dto.UserDTO;

@MyBatisRepository
public interface UserDaoMyBatis {

	/**
	 * 获取用户列表
	 * 以及各种条件的获取
	 * @return
	 */
	List<UserDTO> getUsers();
	
	/**
	 * 根据用户id获取用户信息
	 * @param userId
	 * @return
	 */
//	UserDTO getUser(@Param("userId") Long userId);
	
	/**
	 * 新增或更新用户
	 * @param user
	 */
	void saveOrUpdateUser(UserDTO user);
	

}
