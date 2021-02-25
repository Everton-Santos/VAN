package com.qintess.veterinaria.cadastro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class CadastraAnimal {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int animalId;
	
	private String nomeAnimal;
	
	private String especieAnimal;
	
	private String racaAnimal;
	
	private String idadeAnimal;
	
	private int clienteId;
	
	public CadastraAnimal() {}

	public CadastraAnimal(int animalId, String nomeAnimal, String especieAnimal, String racaAnimal, String idadeAnimal,
			int clienteId) {
		this.animalId = animalId;
		this.nomeAnimal = nomeAnimal;
		this.especieAnimal = especieAnimal;
		this.racaAnimal = racaAnimal;
		this.idadeAnimal = idadeAnimal;
		this.clienteId = clienteId;
	}

	

}
