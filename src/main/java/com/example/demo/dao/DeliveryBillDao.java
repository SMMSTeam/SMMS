package com.example.demo.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.DeliveryBill;

public interface DeliveryBillDao extends 
JpaRepository<DeliveryBill, Serializable>
,Serializable{

}
