package com.api.serviceGerence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.serviceGerence.model.Service;

public interface ServiceRepository extends JpaRepository<Service, Integer>{

}
