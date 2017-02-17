package br.com.mbapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	public String cadastrar(Artigo artigo){
		System.out.println(artigo.getId() + artigo.getTitulo() + artigo.getAutor() + artigo.getTexto());
		repository.save(artigo);
		return "teste";
	}
}
