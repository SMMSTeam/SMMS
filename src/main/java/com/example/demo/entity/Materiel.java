package com.example.demo.entity;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

@Repository
public class Materiel implements Serializable{

	private static final long serialVersionUID = -4813132259918868046L;
	private String materielID;
	private String materielName;
	private int materielType;
	private String materielSpec;
	public Materiel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Materiel(String materielID, String materielName, int materielType, String materielSpec) {
		super();
		this.materielID = materielID;
		this.materielName = materielName;
		this.materielType = materielType;
		this.materielSpec = materielSpec;
	}
	public String getMaterielID() {
		return materielID;
	}
	public void setMaterielID(String materielID) {
		this.materielID = materielID;
	}
	public String getMaterielName() {
		return materielName;
	}
	public void setMaterielName(String materielName) {
		this.materielName = materielName;
	}
	public int getMaterielType() {
		return materielType;
	}
	public void setMaterielType(int materielType) {
		this.materielType = materielType;
	}
	public String getMaterielSpec() {
		return materielSpec;
	}
	public void setMaterielSpec(String materielSpec) {
		this.materielSpec = materielSpec;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Materiel [materielID=" + materielID + ", materielName=" + materielName + ", materielType="
				+ materielType + ", materielSpec=" + materielSpec + "]";
	}
	
	
}
