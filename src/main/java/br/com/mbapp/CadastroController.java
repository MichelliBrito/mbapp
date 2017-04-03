package br.com.mbapp;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.mbapp.model.Artigo;
import br.com.mbapp.repository.ArtigoRepository;

@Controller
public class CadastroController {

	@Autowired
	private ArtigoRepository repository;
	
	@RequestMapping(value="/cadastro", method = RequestMethod.GET)
	public String form(){
		return "cadastro";
	}
	
	@RequestMapping(value="/cadastro", method = RequestMethod.POST)
	public String cadastrar(@Valid Artigo artigo, BindingResult result, RedirectAttributes attributes){
		if(result.hasErrors()){
			attributes.addFlashAttribute("mensagem", "Verifique os campos digitados!");
			return form();
		}
		repository.save(artigo);
		attributes.addFlashAttribute("mensagem", "Artigo publicado com sucesso!");
		return "redirect:/cadastro";
	}
}
