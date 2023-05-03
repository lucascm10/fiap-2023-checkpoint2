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

import br.com.fiap.checkpoint2.model.Pedido;
import br.com.fiap.checkpoint2.repository.PedidoRepository;
import br.com.fiap.checkpoint2.services.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
	
	@Autowired
	PedidoService pedidoService;
	
	@Autowired
	PedidoRepository pedidoRepository;
	
	@GetMapping
	public List<Pedido> get(){
		return pedidoService.get();
	}
	
	@PutMapping
	public Pedido put(Pedido pedido) {
		return pedidoService.put(pedido);
	}

	@PostMapping
	public Pedido post(Pedido pedido) {
		return pedidoService.post(pedido);
	}
	
	@DeleteMapping(value = "{id}")
	public void delete(@PathVariable Long id) {
		pedidoRepository.deleteById(id);		
	}
}
