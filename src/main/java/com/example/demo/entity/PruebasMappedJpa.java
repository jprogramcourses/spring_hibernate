package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnTransformer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "pruebas_mapped_jpa")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PruebasMappedJpa {
	
	@Id
	@Column(name = "idpruebas_mapped_jpa")
	private int idPruebas;
	@Column(name = "string_list")
	private String stringList;
	@Column(name = "temp_fahrenheit")
	@ColumnTransformer(
			read = "(temp_fahrenheit - 32) * 5/9", 
			write = "(? * 9/5) + 32"
	)
	private double tempCelsius;
	@Column(name = "date_en")
	private LocalDate dateESp;
	

}
