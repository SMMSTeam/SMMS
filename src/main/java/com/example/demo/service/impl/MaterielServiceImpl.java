package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MaterielDao;
import com.example.demo.entity.Materiel;
import com.example.demo.service.MaterielService;


@Service("materielService")
public class MaterielServiceImpl implements MaterielService {

	@Autowired
	private MaterielDao materielDao;
	
	@Override
	public List<Materiel> getAllMateriel() {
		// TODO Auto-generated method stub
		return materielDao.findAll();
	}

}
