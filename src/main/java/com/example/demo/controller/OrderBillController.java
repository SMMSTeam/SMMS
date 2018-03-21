package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Materiel;
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
		model.addAttribute("list",mlist);
		return "CreateOrderBill";
	}
	
	@RequestMapping("/create/list")
	public String chooseMateriel(Model model) {
		List<Materiel> list = materielService.getAllMateriel();
		System.out.println(list);
		model.addAttribute("list",list);
		return "MaterielList";
	}
	
	@RequestMapping("/create/list/submit")
	public String submit(List<Materiel> list) {
		this.mlist = list;
		return "redirect:/create";
	}
	
	@RequestMapping("/approve")
	public String startApprove() {
		return null;
	}

}
