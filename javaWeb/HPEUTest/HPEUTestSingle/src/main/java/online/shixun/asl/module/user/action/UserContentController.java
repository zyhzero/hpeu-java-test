/*****************************************************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*****************************************************************************/
package online.shixun.asl.module.user.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import online.shixun.asl.core.ResponseData;
import online.shixun.asl.dto.UserDTO;
//import online.shixun.asl.module.department.service.DepartmentServiceImpl;
//import online.shixun.asl.module.role.service.RoleServiceImpl;
import online.shixun.asl.module.user.service.UserServiceImpl;

@Controller
public class UserContentController {
	
	@Autowired
	private UserServiceImpl userService;
	
	
	/**
	 * 跳转添加user页面
	 * @param model
	 * @param userId
	 * @return
	 */
	@PostMapping("/add")
	public String main(Model model) {
//		model.addAttribute("user", userService.getUser(userId));
//		model.addAttribute("roles", roleService.getSimpleRoles());
//		model.addAttribute("departments", departmentService.getSimpleDepartments());
//		
		return "/add";
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

	@RequestMapping("/javaindex")
	public String javamain(Model model) {
		model.addAttribute("users", userService.getJavaUsers());
		return "/index";
	}
	@RequestMapping("/webindex")
	public String webmain(Model model) {
		model.addAttribute("users", userService.getWebUsers());
		return "/index";
	}
	@RequestMapping("/bigdataindex")
	public String bigdatamain(Model model) {
		model.addAttribute("users", userService.getBigDataUsers());
		return "/index";
	}
	@RequestMapping("/mathindex")
	public String mathmain(Model model) {
		model.addAttribute("users", userService.getMathUsers());
		return "/index";
	}

	@RequestMapping("/maleindex")
	public String malemain(Model model) {
		model.addAttribute("users", userService.getMaleUsers());
		return "/index";
	}
	
	@RequestMapping("/femaleindex")
	public String femalemain(Model model) {
		model.addAttribute("users", userService.getFemaleUsers());
		return "/index";
	}
	
	
}
