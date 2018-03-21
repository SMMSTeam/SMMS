package com.example.demo.dao.impl;

import org.springframework.stereotype.Repository;

import com.example.demo.dao.OrderBillDao;
import com.example.demo.entity.OrderBill;


@Repository("orderBillDao")
public class OrderBillDaoImpl implements OrderBillDao {

	@Override
	public boolean createOrderBill(OrderBill orderBill) {
		// TODO Auto-generated method stub
		return false;
	}

}
