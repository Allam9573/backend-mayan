package com.mayan.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mayan.app.models.Ciudad;

@Repository
public interface CiudadRepository extends CrudRepository<Ciudad, Integer> {

}
