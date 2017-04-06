package br.com.mbapp.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Artigo {
	
	@Id
	@NotBlank(message = "Título é obrigatório")
	private String titulo;
	
	@NotBlank(message = "Autor é obrigatório")
	private String autor;
	

	@DateTimeFormat(pattern="yyyy/mm/dd")
	private Calendar data;
	
	@NotBlank(message = "Texto é obrigatório")
	private String texto;
	
	
	private String resumo;

	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	
	
}
