package com.prueba.nuvu.repository;

import org.springframework.data.repository.CrudRepository;

import com.prueba.nuvu.entity.Cliente;
import com.prueba.nuvu.entity.ClientePK;

public interface ClienteRepository extends CrudRepository<Cliente,ClientePK>{

}
