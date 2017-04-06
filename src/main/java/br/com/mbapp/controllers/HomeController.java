package br.com.mbapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.mbapp.model.Artigo;
import br.com.mbapp.repository.ArtigoRepository;


@Controller
public class HomeController {

	@Autowired
	private ArtigoRepository repository;
	
	@RequestMapping("/")
	public String index(Model model){
		Iterable<Artigo> artigos = repository.findAll();
		model.addAttribute("artigos", artigos);
		System.out.print(artigos);
		return "index";
	}
	
	@RequestMapping(value= "/{titulo}", method = RequestMethod.GET)
	public ModelAndView detalhes(@PathVariable("titulo") String titulo){
		ModelAndView modelAndView = new ModelAndView("artigo");
		Artigo artigos = repository.findOne(titulo);
		modelAndView.addObject("artigos",artigos);
		return modelAndView;
	}
	
	@RequestMapping("/delete")
	public String delete(String titulo){
		repository.delete(titulo);
		return "redirect:/home";
	}
}
