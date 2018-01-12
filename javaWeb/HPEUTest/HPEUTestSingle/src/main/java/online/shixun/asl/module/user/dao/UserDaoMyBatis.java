/*****************************************************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*****************************************************************************/
package online.shixun.asl.module.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import online.shixun.asl.core.MyBatisRepository;
import online.shixun.asl.dto.UserDTO;

@MyBatisRepository
public interface UserDaoMyBatis {

	/**
	 * 获取用户列表
	 * 以及各种条件的获取
	 * @return
	 */
	List<UserDTO> getUsers();
	
	List<UserDTO> getJavaUsers();
	List<UserDTO> getWebUsers();
	List<UserDTO> getBigDataUsers();
	List<UserDTO> getMathUsers();
	List<UserDTO> getMaleUsers();
	List<UserDTO> getFemaleUsers();
	
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
