/*****************************************************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*****************************************************************************/
package project.module.direction.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import project.module.direction.service.DirectionServiceImpl;

@Controller
@RequestMapping("/direction/manage")
public class DirectionManageController {

	@Autowired
	private DirectionServiceImpl directionService;
	
	/**
	 * 权限列表
	 * @param model
	 * @return
	 */
	@RequestMapping("/list")
	public String main(Model model) {
		model.addAttribute("directions", directionService.getDirections());
		
		return "/direction/manage/list";
	}
	
}
