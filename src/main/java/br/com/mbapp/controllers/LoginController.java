package br.com.mbapp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {
	
	
	@RequestMapping(value="/login")
	public String loginForm(){
		return "login";
	}
}
