package com.qintess.veterinaria.dominio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qintess.veterinaria.cadastro.CadastraLogin;
import com.qintess.veterinaria.dominio.sto.CadastraLoginSto;
import com.qintess.veterinaria.entidades.Servicos;

@Controller
@RequestMapping("/login")
public class LoginDominio {
	
	@GetMapping("/novo")
	public String novo(Model model) {
		
		model.addAttribute("login", new CadastraLoginSto());
		
		return "login/login";
	}

}
