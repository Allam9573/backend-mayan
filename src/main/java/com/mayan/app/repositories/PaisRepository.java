package com.mayan.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mayan.app.models.Pais;

@Repository
public interface PaisRepository extends CrudRepository<Pais, Integer> {

}
