package com.example.demo.entity;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

@Repository
public class MaterielIDandNum implements Serializable{

	private static final long serialVersionUID = 2144502755718464908L;
	private String ID;
	private String Num;
	public MaterielIDandNum() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MaterielIDandNum(String iD, String num) {
		super();
		ID = iD;
		Num = num;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getNum() {
		return Num;
	}
	public void setNum(String num) {
		Num = num;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "MaterielIDandNum [ID=" + ID + ", Num=" + Num + "]";
	}
	
}
