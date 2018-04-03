package com.example.demo.entity;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;

@Entity
@Table
public class DeliveryBill implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8232664451196589372L;
	
	@Id
	private String deliverybill_id;
	private String deliverystaff_id;
	private String store_id;
	private MaterielIDandNum[] materiel_nums;
	private String deliverybill_state;
	private String approverid;
	private String opinion;
	
	public DeliveryBill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeliveryBill(String deliverybill_id, String deliverystaff_id, String store_id,
			MaterielIDandNum[] materiel_nums, String deliverybill_state, String approverid, String opinion) {
		super();
		this.deliverybill_id = deliverybill_id;
		this.deliverystaff_id = deliverystaff_id;
		this.store_id = store_id;
		this.materiel_nums = materiel_nums;
		this.deliverybill_state = deliverybill_state;
		this.approverid = approverid;
		this.opinion = opinion;
	}

	public String getDeliverybill_id() {
		return deliverybill_id;
	}

	public void setDeliverybill_id(String deliverybill_id) {
		this.deliverybill_id = deliverybill_id;
	}

	public String getDeliverystaff_id() {
		return deliverystaff_id;
	}

	public void setDeliverystaff_id(String deliverystaff_id) {
		this.deliverystaff_id = deliverystaff_id;
	}

	public String getStore_id() {
		return store_id;
	}

	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}

	public MaterielIDandNum[] getMateriel_nums() {
		return materiel_nums;
	}

	public void setMateriel_nums(MaterielIDandNum[] materiel_nums) {
		this.materiel_nums = materiel_nums;
	}

	public String getDeliverybill_state() {
		return deliverybill_state;
	}

	public void setDeliverybill_state(String deliverybill_state) {
		this.deliverybill_state = deliverybill_state;
	}

	public String getApproverid() {
		return approverid;
	}

	public void setApproverid(String approverid) {
		this.approverid = approverid;
	}

	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "DeliveryBill [deliverybill_id=" + deliverybill_id + ", deliverystaff_id=" + deliverystaff_id
				+ ", store_id=" + store_id + ", materiel_nums=" + Arrays.toString(materiel_nums)
				+ ", deliverybill_state=" + deliverybill_state + ", approverid=" + approverid + ", opinion=" + opinion
				+ "]";
	}
	
}
