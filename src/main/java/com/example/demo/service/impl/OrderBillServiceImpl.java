package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.OrderBillDao;
import com.example.demo.entity.OrderBill;
import com.example.demo.service.OrderBillService;


@Service("orderBillService")
public class OrderBillServiceImpl implements OrderBillService {

	@Autowired
	private OrderBillDao orderBillDao;
	
	@Override
	public void createOrderBill(OrderBill orderBill) {
		// TODO Auto-generated method stub
	}

}
