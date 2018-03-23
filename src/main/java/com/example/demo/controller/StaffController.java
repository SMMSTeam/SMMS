package com.example.demo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.StaffMessage;
import com.example.demo.service.StaffService;
/**
 * 
* @ClassName: StaffController
* @Description:控制器
* @author 陈亚军
* @date 2018年3月23日 上午8:47:03
*
 */

@Controller
@RequestMapping("/staff")
public class StaffController {
	@Resource
	private StaffService staffService;
	
	@RequestMapping("/addStaff")
	public String addStaff(StaffMessage staffManagement){
		
		return " ";
		
	}
	

}
