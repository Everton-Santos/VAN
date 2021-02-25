package com.qintess.veterinaria.dominio.sto;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.qintess.veterinaria.cadastro.CadastraVeterinario;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CadastraVeterinarioSto {
	
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

	public CadastraVeterinarioSto() {}

	public CadastraVeterinarioSto(CadastraVeterinario c) {
		this.veterinarioId = c.getVeterinarioId();
		this.crmv = c.getCrmv();
		this.nomeVeterinario = c.getNomeVeterinario();
		this.rua = c.getRua();
		this.numeroCasa = c.getNumeroCasa();
		this.cidade = c.getCidade();
		this.telefone = c.getTelefone();
		this.especialidades = c.getEspecialidades();
		this.animalId = c.getAnimalId();
		this.servicosId = c.getServicosId();
	}

	public CadastraVeterinario converte() {
		return new CadastraVeterinario(this.veterinarioId, this.crmv, this.nomeVeterinario, this.rua,
				this.numeroCasa, this.cidade, this.telefone, this.especialidades, this.animalId, this.servicosId);
	}
	
	

}
