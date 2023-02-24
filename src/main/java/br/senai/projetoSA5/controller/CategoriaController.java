package br.senai.projetoSA5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.senai.projetoSA5.servico.CategoriaServico;

@Controller
public class CategoriaController {
	
	@Autowired
	private CategoriaServico servico;
	
	@GetMapping({"/categoria"})
	public String listarCategorias(Model modelo) {
		modelo.addAttribute("categoria", servico.listarCatergorias());
		return "categoria"; //Mostra a página categoria.html com as informações do BD
	}
}
