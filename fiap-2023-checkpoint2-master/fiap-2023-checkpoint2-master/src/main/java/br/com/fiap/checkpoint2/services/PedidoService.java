package br.com.fiap.checkpoint2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint2.model.Pedido;
import br.com.fiap.checkpoint2.repository.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	PedidoRepository pedidoRepository;
	
	public List<Pedido> get(){
		return pedidoRepository.findAll();
	}
	
	public Pedido put(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}
	
	public Pedido post(Pedido pedido) {
		return pedidoRepository.save(pedido);
 
	}
}
