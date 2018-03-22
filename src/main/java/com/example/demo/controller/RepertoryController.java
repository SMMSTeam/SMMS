package com.example.demo.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/repertory")
public class RepertoryController {
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@RequestMapping("/inbound")
	public String createInboundBill(Model model) {
		
		return "inbound";
	}
	
	@RequestMapping("/outbound")
	public String createOutboundBill(Model model) {
		return "outbound";
	}
	@RequestMapping("/modify")
	public String createModifyBill(Model model) {
		return "modify";
		
	}

}
