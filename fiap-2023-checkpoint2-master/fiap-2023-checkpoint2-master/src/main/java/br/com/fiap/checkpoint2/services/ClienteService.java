package br.com.fiap.checkpoint2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint2.model.Cliente;
import br.com.fiap.checkpoint2.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	
	public List<Cliente> get(){
		return clienteRepository.findAll();
	}
	
	public Cliente put(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Cliente post(Cliente cliente) {
		return clienteRepository.save(cliente);
 
	}
}
