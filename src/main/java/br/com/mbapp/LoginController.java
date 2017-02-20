package br.com.mbapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.mbapp.model.Admin;
import br.com.mbapp.model.Artigo;
import br.com.mbapp.repository.AdminRepository;


@Controller
public class LoginController {
	
	@Autowired
	private AdminRepository repository;

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginForm(){
		return "login";
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
