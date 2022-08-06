package com.api.serviceGerence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.serviceGerence.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
