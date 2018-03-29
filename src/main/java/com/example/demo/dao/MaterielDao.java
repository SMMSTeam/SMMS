package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Materiel;

public interface MaterielDao {
	
	public List<Materiel> getAllMateriel();
	public List<Materiel> getMaterielByName();
	public List<Materiel> getMaterielBySpecification();

}
