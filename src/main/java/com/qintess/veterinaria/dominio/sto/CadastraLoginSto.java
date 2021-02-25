package com.qintess.veterinaria.dominio.sto;

import javax.persistence.Column;

import com.qintess.veterinaria.cadastro.CadastraLogin;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CadastraLoginSto {
	
	private int loginId;
	
	private String userName;
	
	private int password;

	public CadastraLoginSto() {}

	public CadastraLoginSto(CadastraLogin c) {
		this.loginId = c.getLoginId();
		this.userName = c.getUserName();
		this.password = c.getPassword();
	}
	
	

}
