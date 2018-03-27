package com.example.demo.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import org.springframework.stereotype.Repository;

@Repository
public class ModifyBill implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3627645348620938118L;
	private String modifyBollID;
	private Timestamp modifyTime;
	private String modifyInfo;
	private String empID;
	private String materielID;
	private String materielNum;
	public ModifyBill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ModifyBill(String modifyBollID, Timestamp modifyTime, String modifyInfo, String empID, String materielID,
			String materielNum) {
		super();
		this.modifyBollID = modifyBollID;
		this.modifyTime = modifyTime;
		this.modifyInfo = modifyInfo;
		this.empID = empID;
		this.materielID = materielID;
		this.materielNum = materielNum;
	}
	public String getModifyBollID() {
		return modifyBollID;
	}
	public void setModifyBollID(String modifyBollID) {
		this.modifyBollID = modifyBollID;
	}
	public Timestamp getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}
	public String getModifyInfo() {
		return modifyInfo;
	}
	public void setModifyInfo(String modifyInfo) {
		this.modifyInfo = modifyInfo;
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
		return "ModifyBill [modifyBollID=" + modifyBollID + ", modifyTime=" + modifyTime + ", modifyInfo=" + modifyInfo
				+ ", empID=" + empID + ", materielID=" + materielID + ", materielNum=" + materielNum + "]";
	}
	
}
