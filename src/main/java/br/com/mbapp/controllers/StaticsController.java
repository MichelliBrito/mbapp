package br.com.mbapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticsController {
		
	@RequestMapping("/sobre")
	public String sobre(){
		return "sobre";
	}
	
	@RequestMapping("/contato")
	public String contato(){
		return "contato";
	}
}
