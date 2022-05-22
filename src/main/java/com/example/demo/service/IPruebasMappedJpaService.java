package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.PruebasMappedJpa;

public interface IPruebasMappedJpaService {
	
	List<PruebasMappedJpa> findAll();
	
	void save(PruebasMappedJpa pruebasMapped);

}
