package com.qintess.veterinaria.dominio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qintess.veterinaria.cadastro.CadastraCliente;
import com.qintess.veterinaria.cadastro.CadastraVeterinario;
import com.qintess.veterinaria.dominio.sto.CadastraClienteSto;
import com.qintess.veterinaria.repositorios.CadastraClienteRepository;

@Controller
@RequestMapping("/cadastracliente")
public class ClienteDominio {
	
	@Autowired
	private CadastraClienteRepository cadastraClienteRepository;

	@GetMapping("/novo")
	public String novo(Model model) {
		
		model.addAttribute("cliente", new CadastraClienteSto());
		
		return "cadastro/cliente";
	}
	
	@PostMapping("/cliente")
	public String cadastra(CadastraClienteSto cadastraClienteSto) {
		
		CadastraCliente cliente = cadastraClienteSto.converter();
		
		cadastraClienteRepository.save(cliente);
		
		return "redirect:/exame/novo";
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
			
			model.addAttribute("cliente", cadastraClienteSto);
		}
		
		return "cadastro/cliente";
	}
	
	
	
}
