package com.api.serviceGerence.service;

import org.springframework.stereotype.Service;

import com.api.serviceGerence.repository.ClienteRepository;

@Service
public class clienteService {
  
	private ClienteRepository clienteRepository;
	
	public clienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
}
