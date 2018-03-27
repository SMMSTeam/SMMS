package com.example.demo.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import org.springframework.stereotype.Repository;

@Repository
public class InboundBill implements Serializable{

	private static final long serialVersionUID = 1110088406648945440L;
	private String inboundID;
	private Timestamp inboundTime;
	private String inboundInfo;
	private String empID;
	private String materielID;
	private String materielNum;
	public InboundBill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InboundBill(String inboundID, Timestamp inboundTime, String inboundInfo, String empID, String materielID,
			String materielNum) {
		super();
		this.inboundID = inboundID;
		this.inboundTime = inboundTime;
		this.inboundInfo = inboundInfo;
		this.empID = empID;
		this.materielID = materielID;
		this.materielNum = materielNum;
	}
	public String getInboundID() {
		return inboundID;
	}
	public void setInboundID(String inboundID) {
		this.inboundID = inboundID;
	}
	public Timestamp getInboundTime() {
		return inboundTime;
	}
	public void setInboundTime(Timestamp inboundTime) {
		this.inboundTime = inboundTime;
	}
	public String getInboundInfo() {
		return inboundInfo;
	}
	public void setInboundInfo(String inboundInfo) {
		this.inboundInfo = inboundInfo;
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
		return "InboundBill [inboundID=" + inboundID + ", inboundTime=" + inboundTime + ", inboundInfo=" + inboundInfo
				+ ", empID=" + empID + ", materielID=" + materielID + ", materielNum=" + materielNum + "]";
	}

	
	
	
}
