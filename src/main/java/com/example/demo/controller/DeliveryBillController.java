package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.DeliveryBill;
import com.example.demo.entity.Materiel;
import com.example.demo.entity.OrderBill;
import com.example.demo.service.MaterielService;
import com.example.demo.service.OrderBillService;

@Controller
@RequestMapping("/deliveryBill")
public class DeliveryBillController {
	
	private DeliveryBill deliveryBill;
	
	@Autowired
	private OrderBillService deliverBillService;
	
	@Autowired
	private MaterielService materielService;
	
	private List<Materiel> mlist = null;
	
	@RequestMapping("/orderBillList")
	public String orderBillList(Model model) {
		List<OrderBill> list = new ArrayList<OrderBill>();
		for(int i=0;i<4;i++) {
			list.add(new OrderBill());
		}
		model.addAttribute("list",list);
		return "OrderBillDelivery";
	}
	
	@RequestMapping("/create")
	public String createDeliveryBill(Model model) {
		List<Materiel> list = materielService.getAllMateriel();
		model.addAttribute("list",list);
		return "CreateDeliveryBill";
	}
	

}
