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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import project.core.ResponseData;
import project.dto.UserDTO;
//import project.module.department.service.DepartmentServiceImpl;
//import project.module.role.service.RoleServiceImpl;
import project.module.user.service.UserServiceImpl;

@Controller
@RequestMapping("/user/content")
public class UserContentController {
	
	@Autowired
	private UserServiceImpl userService;
	
//	@Autowired
//	private RoleServiceImpl roleService;
//	
//	@Autowired
//	private DepartmentServiceImpl departmentService;
	
	/**
	 * 跳转添加user页面
	 * @param model
	 * @param userId
	 * @return
	 */
	@PostMapping("/add")
	public String main(Model model, @RequestParam("userId") Long userId) {
//		model.addAttribute("user", userService.getUser(userId));
//		model.addAttribute("roles", roleService.getSimpleRoles());
//		model.addAttribute("departments", departmentService.getSimpleDepartments());
//		
		return "/user/content/add";
	}
	
	
	/**
	 * 新增或更新用户
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public String save(@ModelAttribute UserDTO user) {
		userService.saveOrUpdateUser(user);
		
		return "success";
	}
	
	
	//TODO balabala 条件查询用户
	
	
	
}
