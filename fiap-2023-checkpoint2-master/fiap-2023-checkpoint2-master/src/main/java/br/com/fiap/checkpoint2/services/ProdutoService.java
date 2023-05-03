package br.com.fiap.checkpoint2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint2.model.Produto;
import br.com.fiap.checkpoint2.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository produtoRepository;
	
	public List<Produto> get(){
		return produtoRepository.findAll();
	}
	
	public Produto put(Produto produto) {
		return produtoRepository.save(produto);
	}
	
	public Produto post(Produto produto) {
		return produtoRepository.save(produto);
 
	}
	
}
