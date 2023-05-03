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

import br.com.fiap.checkpoint2.model.Cliente;
import br.com.fiap.checkpoint2.repository.ClienteRepository;
import br.com.fiap.checkpoint2.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

	@Autowired
	ClienteService clienteService;
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping
	public List<Cliente> get(){
		return clienteService.get();
	}
	
	@PutMapping
	public Cliente put(Cliente cliente) {
		return clienteService.put(cliente);
	}

	@PostMapping
	public Cliente post(Cliente cliente) {
		return clienteService.post(cliente);
	}
	
	@DeleteMapping(value = "{id}")
	public void delete(@PathVariable Long id) {
		clienteRepository.deleteById(id);		
	}
}
