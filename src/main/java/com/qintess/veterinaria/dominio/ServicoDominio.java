package com.qintess.veterinaria.dominio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qintess.veterinaria.dominio.sto.ServicosSto;
import com.qintess.veterinaria.entidades.Servicos;

@Controller
@RequestMapping("/servico")
public class ServicoDominio {
	
	@GetMapping("/novo")
	public String novo(Model model) {
		
		model.addAttribute("servicos", new ServicosSto());
		
		return "servico/servico";
	}

}
