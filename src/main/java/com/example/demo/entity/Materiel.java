package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Materiel implements Serializable{

	private static final long serialVersionUID = -4813132259918868046L;
	@Id
	private String materiel_id;
	private String materiel_name;
	private int materiel_type;
	private String materiel_spec;
	public Materiel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Materiel(String materiel_id, String materiel_name, int materiel_type, String materiel_spec) {
		super();
		this.materiel_id = materiel_id;
		this.materiel_name = materiel_name;
		this.materiel_type = materiel_type;
		this.materiel_spec = materiel_spec;
	}
	public String getMateriel_id() {
		return materiel_id;
	}
	public void setMateriel_id(String materiel_id) {
		this.materiel_id = materiel_id;
	}
	public String getMateriel_name() {
		return materiel_name;
	}
	public void setMateriel_name(String materiel_name) {
		this.materiel_name = materiel_name;
	}
	public int getMateriel_type() {
		return materiel_type;
	}
	public void setMateriel_type(int materiel_type) {
		this.materiel_type = materiel_type;
	}
	public String getMateriel_spec() {
		return materiel_spec;
	}
	public void setMateriel_spec(String materiel_spec) {
		this.materiel_spec = materiel_spec;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Materiel [materiel_id=" + materiel_id + ", materiel_name=" + materiel_name + ", materiel_type="
				+ materiel_type + ", materiel_spec=" + materiel_spec + "]";
	}
	
}
