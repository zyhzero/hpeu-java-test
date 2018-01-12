/*****************************************************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*****************************************************************************/
package online.shixun.asl.module.user.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import online.shixun.asl.module.user.service.UserServiceImpl;

@Controller
public class UserManageController {
	
	@Autowired
	private UserServiceImpl userService;

	/**
	 * 跳转用户列表    28行报错？？？？？？
	 * @return
	 */
	@RequestMapping("/index")
	public String main(Model model) {
		model.addAttribute("users", userService.getUsers());
		
		return "/index";
	}
	
}
