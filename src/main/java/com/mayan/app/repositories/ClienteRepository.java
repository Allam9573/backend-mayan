package com.mayan.app.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mayan.app.models.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

    public List<Cliente> findByNombre(String nombre);

}
