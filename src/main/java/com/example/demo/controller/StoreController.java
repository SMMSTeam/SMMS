package com.example.demo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.StoreService;
/**
 * 
* @ClassName: StoreController
* @Description: store控制器
* @author 陈亚军
* @date 2018年3月23日 下午2:14:57
*
 */

@Controller
@RequestMapping("/store")
public class StoreController {
	
	@Resource
	private StoreService storeService;

}
