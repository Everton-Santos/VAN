package com.qintess.veterinaria.dominio.sto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.qintess.veterinaria.entidades.Servicos;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ServicosSto {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int servicosId;
	
	private String cardiologia;
	
	private String clinicaECirurgiaGeral;
	
	private String odontologia;

	private String internamento;
	
	public ServicosSto() {}

	public ServicosSto(Servicos s) {
		super();
		this.servicosId = s.getServicosId();
		this.cardiologia = s.getCardiologia();
		this.clinicaECirurgiaGeral = s.getClinicaECirurgiaGeral();
		this.odontologia = s.getOdontologia();
		this.internamento = s.getInternamento();
	}
	
	

}
