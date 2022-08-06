package com.api.serviceGerence.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.api.serviceGerence.model.Cliente;
import com.api.serviceGerence.service.clienteService;

@RestController
@RequestMapping("/api/cliente/")
public class ClienteController {
  
	private final clienteService clienteService;
	
	public ClienteController(clienteService clienteService) {
		this.clienteService = clienteService;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente save(@RequestBody @Valid Cliente cliente) {
		return clienteService.saveCliente(cliente);
	}
	
	@GetMapping("{id}")
	public Cliente listId(@PathVariable Integer id) {
		return clienteService.listClient(id);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Integer id) {
		clienteService.deleteClient(id);
	}
	
	@PutMapping("{id}")
	public void update(@PathVariable Integer id,@Valid @RequestBody Cliente cliente) {
		 clienteService.updateClient(cliente, id);
	}
}
