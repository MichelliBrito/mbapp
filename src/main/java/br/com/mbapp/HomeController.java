package br.com.mbapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String index(){
		System.out.println("Testando!!!");
		return "index";
	}
}
