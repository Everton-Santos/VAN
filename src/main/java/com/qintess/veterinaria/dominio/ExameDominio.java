package com.qintess.veterinaria.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.JoinColumn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qintess.veterinaria.cadastro.CadastraCliente;
import com.qintess.veterinaria.dominio.sto.CadastraClienteSto;
import com.qintess.veterinaria.repositorios.CadastraClienteRepository;

@Controller
@RequestMapping("/exame")
public class ExameDominio {
	
	@Autowired
	private CadastraClienteRepository cadastraClienteRepository;
	
	@GetMapping("/novo")
	public String novo(Model model) {
		
		model.addAttribute("Exame", retornaCadastraClienteSto());
		
		return "servico/exame";
	}
	
	
	private List<CadastraClienteSto> retornaCadastraClienteSto(){
		
		var cadastraClienteSto = new ArrayList<CadastraClienteSto>();
		
		cadastraClienteRepository.findAll().forEach(c -> {
			cadastraClienteSto.add(new CadastraClienteSto(c));
		});
		
		return cadastraClienteSto;
	}
	
	@GetMapping("/deleta/{id}")
	public String deleta(@PathVariable int id) {
		
		cadastraClienteRepository.deleteById(id);
		
		return "redirect:/exame/novo";
	}
	
	@GetMapping("/atualiza/{id}")
	public String atualiza(@PathVariable int id, Model model) {
		
		var cadastraClienteOptional = cadastraClienteRepository.findById(id);
		
		if(cadastraClienteOptional.isPresent()) {
			var cadastraCliente = cadastraClienteOptional.get();
			
			var cadastraClienteSto = new CadastraClienteSto(cadastraCliente);
			
			model.addAttribute("Exame", cadastraClienteSto);
		}
		
		return "cadastro/cliente";
	}
	
	
	

}
