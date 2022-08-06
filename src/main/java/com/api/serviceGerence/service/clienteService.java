package com.api.serviceGerence.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.api.serviceGerence.model.Cliente;
import com.api.serviceGerence.repository.ClienteRepository;

@Service
public class clienteService {
  
	private ClienteRepository clienteRepository;
	
	public clienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Cliente listClient(Integer id) {
		Cliente find = clienteRepository
				.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
		return find;
	}
}
