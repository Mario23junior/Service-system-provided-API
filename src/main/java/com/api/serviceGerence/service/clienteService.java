package com.api.serviceGerence.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.api.serviceGerence.exceptions.ExceptionsReturnMessage;
import com.api.serviceGerence.model.Cliente;
import com.api.serviceGerence.repository.ClienteRepository;

@Service
public class clienteService {
  
	private ClienteRepository clienteRepository;
	
	public clienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public Cliente saveCliente(Cliente cliente) {
		Cliente saveCli = clienteRepository.save(cliente);
		if(saveCli.equals(null)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
		return saveCli;
	}
	
	public Cliente listClient(Integer id) {
		Cliente find = clienteRepository
				.findById(id)
				.orElseThrow(() -> new ExceptionsReturnMessage("Erro ao buscar id "+id+ ", não encontrado", HttpStatus.NOT_FOUND));
		return find;
	}
	
	public void deleteClient(Integer id) {
		     clienteRepository
				.findById(id)
				.map(findId -> {
					clienteRepository.delete(findId);
					return Void.TYPE;
				})
				.orElseThrow(() -> new ExceptionsReturnMessage("Erro ao deletar id"+ id, HttpStatus.NO_CONTENT));
 	}
	
	
	public void updateClient(Cliente clienteAtualizado, Integer id) {
		clienteRepository
		.findById(id)
		.map(findId -> {
			clienteAtualizado.setId(findId.getId());
			return clienteRepository.save(clienteAtualizado);
		})
		.orElseThrow(() -> new ExceptionsReturnMessage("Erro ao buscar atualizar o id "+ id, HttpStatus.NOT_FOUND));
	}
}

