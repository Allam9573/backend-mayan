package com.mayan.app.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mayan.app.models.ClaseAsiento;

@Repository
public interface ClaseAsientoRepository extends CrudRepository<ClaseAsiento, Integer> {

    public List<ClaseAsiento> findByNombre(String nombre);

}
