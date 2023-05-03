package br.com.fiap.checkpoint2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint2.model.ItemPedido;
import br.com.fiap.checkpoint2.repository.ItemPedidoRepository;

@Service
public class ItemPedidoService {

	@Autowired
	ItemPedidoRepository itemPedidoRepository;
	
	public List<ItemPedido> get(){
		return itemPedidoRepository.findAll();
	}
	
	public ItemPedido put(ItemPedido itemPedido) {
		return itemPedidoRepository.save(itemPedido);
	}
	
	public ItemPedido post(ItemPedido itemPedido) {
		return itemPedidoRepository.save(itemPedido);
 
	}
}
