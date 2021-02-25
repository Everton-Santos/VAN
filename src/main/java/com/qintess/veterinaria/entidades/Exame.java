package com.qintess.veterinaria.entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Exame {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int agendamentoId;
	
	private String examesSolicitados;
	
	private String diagnosticosFormulados;
	
	private String tratamentosPrescritos;
	
	private int veterinarioId;
	
	private int clienteId;
	
	private int servicosId;
	
	private int animalId;
	
	private LocalDateTime dataAgendamento;
	
	private LocalDate dataCriacaoConsulta;
	
	public Exame() {}
}
