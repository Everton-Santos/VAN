package com.qintess.veterinaria.dominio.sto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.qintess.veterinaria.cadastro.CadastraCliente;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CadastraClienteSto extends CadastraAnimalSto{
	
	private int clienteId;
	
	private String cpf;
	
	private String nomeCliente;
	
	private String rua;
	
	private int numeroCasa;
	
	private String cidade;
	
	private String telefone;
	
	private int servicosId;
	
	private int loginId;
	
	private String dataAgendamento;
	
	private String dataCriacaoConsulta;
	
	public CadastraClienteSto() {}

	public CadastraClienteSto(CadastraCliente c) {
		this.clienteId = c.getClienteId();
		this.cpf = c.getCpf();
		this.nomeCliente = c.getNomeCliente();
		this.rua = c.getRua();
		this.numeroCasa = c.getNumeroCasa();
		this.cidade = c.getCidade();
		this.telefone = c.getTelefone();
		this.servicosId = c.getServicosId();
		this.loginId = c.getLoginId();
		this.dataAgendamento = c.getDataAgendamento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		this.dataCriacaoConsulta = c.getDataCriacaoConsulta().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	public CadastraCliente converter() {
//		var data = LocalDate.parse(this.dataAgendamento, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		return new CadastraCliente(this.clienteId, this.cpf, this.nomeCliente, this.rua, this.numeroCasa,
				this.cidade, this.telefone, this.servicosId, this.loginId );
	}
	
	

}
