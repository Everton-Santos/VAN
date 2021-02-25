package com.qintess.veterinaria.dominio.sto;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.qintess.veterinaria.cadastro.CadastraAnimal;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CadastraAnimalSto {
	
	private int animalId;
	
	private String nomeAnimal;
	
	private String especieAnimal;
	
	private String racaAnimal;
	
	private String idadeAnimal;
	
	private int clienteId;
	
	
	public CadastraAnimalSto() {}

	public CadastraAnimalSto(CadastraAnimal c) {
		this.animalId = c.getAnimalId();
		this.nomeAnimal = c.getNomeAnimal();
		this.especieAnimal = c.getEspecieAnimal();
		this.racaAnimal = c.getRacaAnimal();
		this.idadeAnimal = c.getIdadeAnimal();
		this.clienteId = c.getClienteId();
	}
	
	public CadastraAnimal converte() {
		return new CadastraAnimal(this.animalId, this.nomeAnimal, this.especieAnimal, 
				this.racaAnimal, this.idadeAnimal, this.clienteId);
	}
	
	

}
