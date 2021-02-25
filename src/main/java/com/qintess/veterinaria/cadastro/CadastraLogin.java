package com.qintess.veterinaria.cadastro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class CadastraLogin {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loginId;
	
	private String userName;
	
	private int password;

	public CadastraLogin() {}
}
