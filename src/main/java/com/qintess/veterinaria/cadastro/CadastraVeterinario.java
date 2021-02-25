package com.qintess.veterinaria.cadastro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class CadastraVeterinario {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int veterinarioId;
	
	private int crmv;
	
	private String nomeVeterinario;
	
	private String rua;
	
	private int numeroCasa;
	
	private String cidade;
	
	private String telefone;
	
	private String especialidades;
	
	private int animalId;
	
	private int servicosId;

	public CadastraVeterinario() {}

	public CadastraVeterinario(int veterinarioId, int crmv, String nomeVeterinario, String rua, int numeroCasa,
			String cidade, String telefone, String especialidades, int animalId, int servicosId) {
		this.veterinarioId = veterinarioId;
		this.crmv = crmv;
		this.nomeVeterinario = nomeVeterinario;
		this.rua = rua;
		this.numeroCasa = numeroCasa;
		this.cidade = cidade;
		this.telefone = telefone;
		this.especialidades = especialidades;
		this.animalId = animalId;
		this.servicosId = servicosId;
	}

	
	
	

}
