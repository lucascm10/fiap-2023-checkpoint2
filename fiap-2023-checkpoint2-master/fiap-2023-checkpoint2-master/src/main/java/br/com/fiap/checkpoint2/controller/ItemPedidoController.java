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

import br.com.fiap.checkpoint2.model.ItemPedido;
import br.com.fiap.checkpoint2.repository.ItemPedidoRepository;
import br.com.fiap.checkpoint2.services.ItemPedidoService;

@RestController
@RequestMapping("/itens")
public class ItemPedidoController {
	
	@Autowired
	ItemPedidoService itemPedidoService;

	@Autowired
	ItemPedidoRepository itemPedidoRepository;

	@GetMapping
	public List<ItemPedido> get() {
		return itemPedidoService.get();
	}

	@PutMapping
	public ItemPedido put(ItemPedido itemPedido) {
		return itemPedidoService.put(itemPedido);
	}

	@PostMapping
	public ItemPedido post(ItemPedido itemPedido) {
		return itemPedidoService.post(itemPedido);
	}

	@DeleteMapping(value = "{id}")
	public void delete(@PathVariable Long id) {
		itemPedidoRepository.deleteById(id);
	}
}
