package com.qintess.veterinaria.cadastro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class CadastraCliente {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clienteId;
	
	private String cpf;
	
	private String nomeCliente;
	
	private String rua;
	
	private int numeroCasa;
	
	private String cidade;
	
	private String telefone;
	
	private int servicosId;
	
	private int loginId;
	
	private LocalDateTime dataAgendamento;
	
	private LocalDate dataCriacaoConsulta;
	
	public CadastraCliente() {}

	public CadastraCliente(int clienteId, String cpf, String nomeCliente, String rua, int numeroCasa, String cidade,
			String telefone, int servicosId, int loginId) {
		this.clienteId = clienteId;
		this.cpf = cpf;
		this.nomeCliente = nomeCliente;
		this.rua = rua;
		this.numeroCasa = numeroCasa;
		this.cidade = cidade;
		this.telefone = telefone;
		this.servicosId = servicosId;
		this.loginId = loginId;
		this.dataAgendamento = LocalDateTime.now();
		this.dataCriacaoConsulta = LocalDate.now();
	}
	
	

	

	
	

	
}
