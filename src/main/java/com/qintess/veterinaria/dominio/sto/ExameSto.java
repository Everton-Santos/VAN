package com.qintess.veterinaria.dominio.sto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.qintess.veterinaria.entidades.Exame;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ExameSto {
	
	private int agendamentoId;
	
	private String examesSolicitados;
	
	private String diagnosticosFormulados;
	
	private String tratamentosPrescritos;
	
	private int veterinarioId;
	
	private int clienteId;
	
	private int servicosId;
	
	private int animalId;
	
	private String dataAgendamento;
	
	private String dataCriacaoConsulta;
	
	public ExameSto() {}

	public ExameSto(Exame a) {
		this.agendamentoId = a.getAgendamentoId();
		this.examesSolicitados = a.getExamesSolicitados();
		this.diagnosticosFormulados = a.getDiagnosticosFormulados();
		this.tratamentosPrescritos = a.getTratamentosPrescritos();
		this.veterinarioId = a.getVeterinarioId();
		this.clienteId = a.getClienteId();
		this.servicosId = a.getServicosId();
		this.animalId = a.getAnimalId();
		this.dataAgendamento = a.getDataAgendamento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		this.dataCriacaoConsulta = a.getDataCriacaoConsulta().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
	}
	
	

}
