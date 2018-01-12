/*****************************************************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*****************************************************************************/
package project.module.user.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import project.module.user.service.UserServiceImpl;

@Controller
@RequestMapping("/user/manage")
public class UserManageController {
	
	@Autowired
	private UserServiceImpl userService;

	/**
	 * 跳转用户列表
	 * @return
	 */
	@RequestMapping("/list")
	public String main(Model model) {
		model.addAttribute("users", userService.getUsers());
		
		return "/user/manage/list";
	}
	
}
