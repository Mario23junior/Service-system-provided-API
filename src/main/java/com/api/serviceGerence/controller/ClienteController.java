package com.api.serviceGerence.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.serviceGerence.service.clienteService;

@RestController
@RequestMapping("/api/cliente/")
public class ClienteController {
  
	private final clienteService clienteService;
	
	public ClienteController(clienteService clienteService) {
		this.clienteService = clienteService;
	}
}
