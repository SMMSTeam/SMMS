package com.example.demo.entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;

@Entity
@Table
public class OrderBill implements Serializable{

	private static final long serialVersionUID = 123001489782724630L;
	@Id
	private String orderbill_id;
	private String store_id;
	private String orderer_id;
	private MaterielIDandNum[] materiel_nums;
	private Date create_time;
	private String orderbill_state;
	private String approver1id;
	private String opinion1;
	private String approver2id;
	private String opinion2;
	
	public OrderBill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderBill(String orderbill_id, String store_id, String orderer_id, MaterielIDandNum[] materiel_nums,
			Date create_time, String orderbill_state, String approver1id, String opinion1, String approver2id,
			String opinion2) {
		super();
		this.orderbill_id = orderbill_id;
		this.store_id = store_id;
		this.orderer_id = orderer_id;
		this.materiel_nums = materiel_nums;
		this.create_time = create_time;
		this.orderbill_state = orderbill_state;
		this.approver1id = approver1id;
		this.opinion1 = opinion1;
		this.approver2id = approver2id;
		this.opinion2 = opinion2;
	}

	public String getOrderbill_id() {
		return orderbill_id;
	}

	public void setOrderbill_id(String orderbill_id) {
		this.orderbill_id = orderbill_id;
	}

	public String getStore_id() {
		return store_id;
	}

	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}

	public String getOrderer_id() {
		return orderer_id;
	}

	public void setOrderer_id(String orderer_id) {
		this.orderer_id = orderer_id;
	}

	public MaterielIDandNum[] getMateriel_nums() {
		return materiel_nums;
	}

	public void setMateriel_nums(MaterielIDandNum[] materiel_nums) {
		this.materiel_nums = materiel_nums;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getOrderbill_state() {
		return orderbill_state;
	}

	public void setOrderbill_state(String orderbill_state) {
		this.orderbill_state = orderbill_state;
	}

	public String getApprover1id() {
		return approver1id;
	}

	public void setApprover1id(String approver1id) {
		this.approver1id = approver1id;
	}

	public String getOpinion1() {
		return opinion1;
	}

	public void setOpinion1(String opinion1) {
		this.opinion1 = opinion1;
	}

	public String getApprover2id() {
		return approver2id;
	}

	public void setApprover2id(String approver2id) {
		this.approver2id = approver2id;
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
		return "OrderBill [orderbill_id=" + orderbill_id + ", store_id=" + store_id + ", orderer_id=" + orderer_id
				+ ", materiel_nums=" + Arrays.toString(materiel_nums) + ", create_time=" + create_time
				+ ", orderbill_state=" + orderbill_state + ", approver1id=" + approver1id + ", opinion1=" + opinion1
				+ ", approver2id=" + approver2id + ", opinion2=" + opinion2 + "]";
	}
	
	
	
}
