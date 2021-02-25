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

import com.qintess.veterinaria.cadastro.CadastraAnimal;
import com.qintess.veterinaria.dominio.sto.CadastraAnimalSto;
import com.qintess.veterinaria.repositorios.CadastraAnimalRepository;

@Controller
@RequestMapping("/cadastraanimal")
public class AnimalDominio {
	
	@Autowired
	private CadastraAnimalRepository cadastraAnimalRepository;
	
	@GetMapping("/novo")
	public String novo(Model model) {
		
		model.addAttribute("animal", retornaCadastraAnimalSto());
		
		return "cadastro/animal";
	}

	private List<CadastraAnimalSto> retornaCadastraAnimalSto() {
		
		var cadastraAnimalSto = new ArrayList<CadastraAnimalSto>();
		
		cadastraAnimalRepository.findAll().forEach(c -> {
			cadastraAnimalSto.add(new CadastraAnimalSto(c));
		});
		
		return cadastraAnimalSto;
	}
	
	@GetMapping("/deleta/{id}")
	public String deleta(@PathVariable int id) {
	
		cadastraAnimalRepository.deleteById(id);
		
		return "redirect:/cadastraanimal/novo";
	}
	
	@GetMapping("/atualiza/{id}")
	public String atualiza(@PathVariable int id, Model model) {
		
		var cadastraAnimalOptional = cadastraAnimalRepository.findById(id);
		
		if(cadastraAnimalOptional.isPresent()) {
			var cadastraAnimal = cadastraAnimalOptional.get();
			
			var cadastraAnimalSto = new CadastraAnimalSto(cadastraAnimal);
			
			model.addAttribute("animal", cadastraAnimalSto);
		}
		
		return "cadastro/animal";
	}
	
	
	@PostMapping("/animal")
	public String cadastra(CadastraAnimalSto cadastraAnimalSto) {
		
		CadastraAnimal animal = cadastraAnimalSto.converte();
		
		cadastraAnimalRepository.save(animal);
		
		return "redirect:/cadastraanimal/novo";
	}
	
	
}
