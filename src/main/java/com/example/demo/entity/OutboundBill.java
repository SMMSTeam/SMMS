package com.example.demo.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import org.springframework.stereotype.Repository;

@Repository
public class OutboundBill implements Serializable{

	private static final long serialVersionUID = -6387532388291911491L;
	private String outboundID;
	private Timestamp outboundTime;
	private String outboundInfo;
	private String empID;
	private String materielID;
	private String materielNum;
	public OutboundBill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OutboundBill(String outboundID, Timestamp outboundTime, String outboundInfo, String empID, String materielID,
			String materielNum) {
		super();
		this.outboundID = outboundID;
		this.outboundTime = outboundTime;
		this.outboundInfo = outboundInfo;
		this.empID = empID;
		this.materielID = materielID;
		this.materielNum = materielNum;
	}
	public String getOutboundID() {
		return outboundID;
	}
	public void setOutboundID(String outboundID) {
		this.outboundID = outboundID;
	}
	public Timestamp getOutboundTime() {
		return outboundTime;
	}
	public void setOutboundTime(Timestamp outboundTime) {
		this.outboundTime = outboundTime;
	}
	public String getOutboundInfo() {
		return outboundInfo;
	}
	public void setOutboundInfo(String outboundInfo) {
		this.outboundInfo = outboundInfo;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getMaterielID() {
		return materielID;
	}
	public void setMaterielID(String materielID) {
		this.materielID = materielID;
	}
	public String getMaterielNum() {
		return materielNum;
	}
	public void setMaterielNum(String materielNum) {
		this.materielNum = materielNum;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "OutboundBill [outboundID=" + outboundID + ", outboundTime=" + outboundTime + ", outboundInfo="
				+ outboundInfo + ", empID=" + empID + ", materielID=" + materielID + ", materielNum=" + materielNum
				+ "]";
	}
	
}
