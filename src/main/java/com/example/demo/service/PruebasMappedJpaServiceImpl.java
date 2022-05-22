package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PruebasMappedJpa;
import com.example.demo.repository.PruebasMappedJpaRepository;

@Service
public class PruebasMappedJpaServiceImpl implements IPruebasMappedJpaService {
	
	@Autowired
	private PruebasMappedJpaRepository pruebasRepository;

	@Override
	public List<PruebasMappedJpa> findAll() {
		return pruebasRepository.findAll();
	}

	@Override
	public void save(PruebasMappedJpa pruebasMapped) {
		if(pruebasMapped != null)
			pruebasRepository.save(pruebasMapped);
		
	}

}
