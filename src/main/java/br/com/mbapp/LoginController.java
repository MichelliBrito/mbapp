package br.com.mbapp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginForm(){
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(){
		return "cadastro";
	}
	
//	@RequestMapping(value="/login", method=RequestMethod.POST)
//	public String login(String login){
//		Admin admin = repository.findOne(login);
//		if(admin.getLogin() == login){
//			return "redirect:cadastro";
//		}
//		System.out.println("Erro, tente novamente!!!!!!!!!!");
//		return "redirect:login";
//	}
}
