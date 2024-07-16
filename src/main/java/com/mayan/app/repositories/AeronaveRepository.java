package com.mayan.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mayan.app.models.Aeronave;

@Repository
public interface AeronaveRepository extends CrudRepository<Aeronave, Integer> {

    public Aeronave findByModelo(String nombre);

}
