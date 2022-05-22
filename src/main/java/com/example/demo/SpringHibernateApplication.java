package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.PruebasMappedJpa;
import com.example.demo.service.IEmployeeService;
import com.example.demo.service.IPruebasMappedJpaService;

@SpringBootApplication
public class SpringHibernateApplication implements CommandLineRunner {
	
	@Autowired
	private IEmployeeService employeeService;
	
	@Autowired
	private IPruebasMappedJpaService pruebasService;
	
	private static List<PruebasMappedJpa> listPruebas = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		employeeService.findAll().stream().forEach(System.out::println);
		
		getListPruebaMapped();
		
		for(PruebasMappedJpa prueba : listPruebas) {
			pruebasService.save(prueba);
		}
		
		pruebasService.findAll().stream().forEach(System.out::println);
		
	}
	
	private static void getListPruebaMapped() {
		for(int i = 0; i < 10; i++) {
			PruebasMappedJpa prueba1 = new PruebasMappedJpa(i, "0001,0002,0003,0004", 63.2 + i, LocalDate.now());
			listPruebas.add(prueba1);
		}
	}

}
