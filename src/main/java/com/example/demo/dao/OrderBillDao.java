package com.example.demo.dao;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.OrderBill;

public interface OrderBillDao extends 
JpaRepository<OrderBill, Serializable>
,Serializable{

}
