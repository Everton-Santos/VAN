package com.qintess.veterinaria.dominio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qintess.veterinaria.dominio.sto.CadastraLoginSto;

@Controller
@RequestMapping("/login")
public class LoginDominio {
	
	@GetMapping("/novo")
	public String novo(Model model) {
		
		model.addAttribute("login", new CadastraLoginSto());
		
		return "login/login";
	}
	
	// abrir pagina login
	@GetMapping({"/login/novo"})
	public String login() {
		return "/";
	}
	
//	// login invalido
//		@GetMapping({"/login-error"})
//		public String loginError(ModelMap model) {
//			model.addAttribute("alerta", "erro");
//			model.addAttribute("titulo", "Credenciais inválidas!");
//			model.addAttribute("texto", "Login ou senha incorretos, tente novamente");
//			model.addAttribute("subtexto", "Acesso permitido apenas para cadastros já ativados.");
//			return "login/login";
//		}

}
