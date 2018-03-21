package com.example.demo.entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class OrderBill implements Serializable{

	private static final long serialVersionUID = 123001489782724630L;
	private String orderBillID;
	private String storeID;
	private String ordererID;
	private MaterielIDandNum[] materielIDandNums;
	private Date createTime;
	private String orderBillState;
	private String approver1ID;
	private String opinion1;
	private String approver2ID;
	private String opinion2;
	
	public OrderBill() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public OrderBill(String orderBillID, String storeID, String ordererID) {
		super();
		this.orderBillID = orderBillID;
		this.storeID = storeID;
		this.ordererID = ordererID;
	}

	public OrderBill(String orderBillID, String storeID, String ordererID, MaterielIDandNum[] materielIDandNums,
			Date createTime) {
		super();
		this.orderBillID = orderBillID;
		this.storeID = storeID;
		this.ordererID = ordererID;
		this.materielIDandNums = materielIDandNums;
		this.createTime = createTime;
		this.orderBillState = "待审";
	}

	public OrderBill(String orderBillID, String storeID, String ordererID, MaterielIDandNum[] materielIDandNums,
			Date createTime, String approver1id, String opinion1) {
		super();
		this.orderBillID = orderBillID;
		this.storeID = storeID;
		this.ordererID = ordererID;
		this.materielIDandNums = materielIDandNums;
		this.createTime = createTime;
		this.approver1ID = approver1id;
		this.opinion1 = opinion1;
		this.orderBillState = "一审通过";
	}

	public OrderBill(String orderBillID, String storeID, String ordererID, MaterielIDandNum[] materielIDandNums,
			Date createTime, String approver1id, String opinion1, String approver2id, String opinion2) {
		super();
		this.orderBillID = orderBillID;
		this.storeID = storeID;
		this.ordererID = ordererID;
		this.materielIDandNums = materielIDandNums;
		this.createTime = createTime;
		this.approver1ID = approver1id;
		this.opinion1 = opinion1;
		this.approver2ID = approver2id;
		this.opinion2 = opinion2;
		this.orderBillState = "二审通过";
	}

	public String getOrderBillID() {
		return orderBillID;
	}

	public void setOrderBillID(String orderBillID) {
		this.orderBillID = orderBillID;
	}

	public String getStoreID() {
		return storeID;
	}

	public void setStoreID(String storeID) {
		this.storeID = storeID;
	}

	public String getOrdererID() {
		return ordererID;
	}

	public void setOrdererID(String ordererID) {
		this.ordererID = ordererID;
	}

	public MaterielIDandNum[] getMaterielIDandNums() {
		return materielIDandNums;
	}

	public void setMaterielIDandNums(MaterielIDandNum[] materielIDandNums) {
		this.materielIDandNums = materielIDandNums;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getOrderBillState() {
		return orderBillState;
	}

	public void setOrderBillState(String orderBillState) {
		this.orderBillState = orderBillState;
	}

	public String getApprover1ID() {
		return approver1ID;
	}

	public void setApprover1ID(String approver1id) {
		approver1ID = approver1id;
	}

	public String getOpinion1() {
		return opinion1;
	}

	public void setOpinion1(String opinion1) {
		this.opinion1 = opinion1;
	}

	public String getApprover2ID() {
		return approver2ID;
	}

	public void setApprover2ID(String approver2id) {
		approver2ID = approver2id;
	}

	public String getOpinion2() {
		return opinion2;
	}

	public void setOpinion2(String opinion2) {
		this.opinion2 = opinion2;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "OrderBill [orderBillID=" + orderBillID + ", storeID=" + storeID + ", ordererID=" + ordererID
				+ ", materielIDandNums=" + Arrays.toString(materielIDandNums) + ", createTime=" + createTime
				+ ", orderBillState=" + orderBillState + ", approver1ID=" + approver1ID + ", opinion1=" + opinion1
				+ ", approver2ID=" + approver2ID + ", opinion2=" + opinion2 + "]";
	}
	
	
	
	
	
	

}
