package com.example.demo.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Materiel;

public interface MaterielDao extends 
JpaRepository<Materiel, Serializable>
,Serializable{
	
}
