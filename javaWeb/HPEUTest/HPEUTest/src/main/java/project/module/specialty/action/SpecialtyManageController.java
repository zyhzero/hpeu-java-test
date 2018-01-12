/*****************************************************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*****************************************************************************/
package project.module.specialty.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import project.module.specialty.service.SpecialtyServiceImpl;

@Controller
@RequestMapping("/specialty/manage")
public class SpecialtyManageController {
	
	@Autowired
	private SpecialtyServiceImpl specialtyService;

	/**
	 * 角色列表
	 * @param model
	 * @return
	 */
	@RequestMapping("list")
	public String main(Model model) {
		model.addAttribute("specialtys", specialtyService.getSpecialtys());
		
		return "/specialty/manage/list";
	}
	
}
