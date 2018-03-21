package com.example.demo.entity;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

@Repository
public class Materiel implements Serializable{

	private static final long serialVersionUID = -4813132259918868046L;
	private String materielID;
	private String materielName;
	public Materiel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Materiel(String materielID, String materielName) {
		super();
		this.materielID = materielID;
		this.materielName = materielName;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Materiel [materielID=" + materielID + ", materielName=" + materielName + "]";
	}
}
