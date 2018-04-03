package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Materiel;
import com.example.demo.entity.OrderBill;
import com.example.demo.service.MaterielService;
import com.example.demo.service.OrderBillService;

@Controller
@RequestMapping("/orderBill")
public class OrderBillController {
	
	@Autowired
	private OrderBillService orderBillService;
	@Autowired
	private MaterielService materielService;
	
	private List<Materiel> mlist = null;
	
	@RequestMapping("/create")
	public String createOrderBill(Model model) {
		System.out.println("create start");
		List<Materiel> list = materielService.getAllMateriel();
		model.addAttribute("list",list);
		return "CreateOrderBill";
	}

	
	@RequestMapping("/approve")
	public String Approvelist(Model model) {
		List<OrderBill> list = new ArrayList<OrderBill>();
		for(int i=0;i<4;i++) {
			list.add(new OrderBill());
		}
		model.addAttribute("list",list);
		return "OrderBillList";
	}
	
	@RequestMapping("/approve/detail")
	public String startApprove() {
		return "ApproveOrderBill";
	}
	

}
