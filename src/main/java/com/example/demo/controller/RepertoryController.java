package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/repertory")
public class RepertoryController {
	public String createInboundBill() {
		return "/inbound";
	}
	public String createOutboundBill() {
		return "/outbound";
	}

}
