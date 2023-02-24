package br.senai.projetoSA5.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senai.projetoSA5.orm.Categoria;
import br.senai.projetoSA5.repository.CategoriaRepository;

@Service
public class CategoriaServicoCRUD implements CategoriaServico {
	@Autowired
	private CategoriaRepository repository;
	
	public List<Categoria> listarCatergorias(){
		return (List<Categoria>) repository.findAll();
	}
	
	public void apagarCategoria(Integer id) {
		repository.deleteById(id);
	}
	
	public Categoria salvarCategoria(Categoria categoria) {
		return repository.save(categoria);
	}
	
	public Categoria consultaCategoriaId(Integer id) {
		return repository.findById(id).get();
	}
	
	public Categoria atualizarCategoria(Categoria categoria) {
		return repository.save(categoria);
	}
}
