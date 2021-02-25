package com.qintess.veterinaria.entidades;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Servicos {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int servicosId;

	private String cardiologia;
	
	private String clinicaECirurgiaGeral;
	
	private String odontologia;
	
	private String internamento;
	
	public Servicos() {}

	

}
