package br.com.fiap.checkpoint2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint2.model.Produto;
import br.com.fiap.checkpoint2.repository.ProdutoRepository;
import br.com.fiap.checkpoint2.services.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	ProdutoService produtoService;
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping
	public List<Produto> get(){
		return produtoService.get();
	}
	
	@PutMapping
	public Produto put(Produto produto) {
		return produtoService.put(produto);
	}

	@PostMapping
	public Produto post(Produto produto) {
		return produtoService.post(produto);
	}
	
	@DeleteMapping(value = "{id}")
	public void delete(@PathVariable Long id) {
		produtoRepository.deleteById(id);		
	}
}
