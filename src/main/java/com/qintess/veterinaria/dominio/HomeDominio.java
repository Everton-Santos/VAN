package com.qintess.veterinaria.dominio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qintess.veterinaria.cadastro.CadastraCliente;
import com.qintess.veterinaria.dominio.sto.CadastraClienteSto;
import com.qintess.veterinaria.repositorios.CadastraClienteRepository;

@Controller
public class HomeDominio {
	
//	@Autowired
//	private CadastraClienteRepository cadastraClienteRepository;
	
	@RequestMapping("")
	public String home(Model model) {
		
		model.addAttribute("home");
//		model.addAttribute("cliente", retornaCadastraClienteSto());
		
		return "index";
	}

//	 private List<CadastraClienteSto> retornaCadastraClienteSto() { 
//		
//		var cadastraClienteSto = new ArrayList<CadastraClienteSto>();
//		
//		cadastraClienteRepository.findAll().forEach(c -> {
//			cadastraClienteSto.add(new CadastraClienteSto(c));
//		});
//		
//		return cadastraClienteSto;
//	} 
}
