package com.qintess.veterinaria.dominio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qintess.veterinaria.cadastro.CadastraVeterinario;
import com.qintess.veterinaria.dominio.sto.CadastraVeterinarioSto;
import com.qintess.veterinaria.repositorios.CadastraVeterinarioRepository;

@Controller
@RequestMapping("/cadastraveterinario")
public class VeterinarioDominio {
	
	@Autowired
	private CadastraVeterinarioRepository cadastraVeterinarioRepository;
	
	@GetMapping("/novo")
	public String novo(Model model) {
		
		model.addAttribute("Veterinario", retornaCadastraVeterinarioSto());
		
		return "cadastro/veterinario";
	}

	private List<CadastraVeterinarioSto> retornaCadastraVeterinarioSto(){
		
		var cadastraVeterinarioSto = new ArrayList<CadastraVeterinarioSto>();
		
		cadastraVeterinarioRepository.findAll().forEach(c ->{
			cadastraVeterinarioSto.add(new CadastraVeterinarioSto(c));
		});
		
		return cadastraVeterinarioSto;
	}
	
	@GetMapping("/deleta/{id}")
	public String deleta(@PathVariable int id) {
		
		cadastraVeterinarioRepository.deleteById(id);
		
		return "redirect:/cadastraveterinario/novo";
	}
	
	
	@GetMapping("/atualiza/{id}")
	public String atualiza(@PathVariable int id, Model model) {
		
		var cadastraVeterinarioOptional = cadastraVeterinarioRepository.findById(id);
		
		if(cadastraVeterinarioOptional.isPresent()) {
			var cadastraVeterinario = cadastraVeterinarioOptional.get();
			
			var cadastraVeterinarioSto = new CadastraVeterinarioSto(cadastraVeterinario);
			
			model.addAttribute("Veterinario", cadastraVeterinarioSto);
		}
		
		return "cadastro/veterinario";
	}
	
	
	
	
	@PostMapping("/veterinario")
	public String cadastra(CadastraVeterinarioSto cadastraVeterinarioSto) {
		
		CadastraVeterinario veterinario = cadastraVeterinarioSto.converte();
		
		cadastraVeterinarioRepository.save(veterinario);
		
		return "redirect:/cadastraveterinario/novo";
	}

}
