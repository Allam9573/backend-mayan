package com.mayan.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayan.app.models.Ciudad;
import com.mayan.app.repositories.CiudadRepository;
import com.mayan.app.services.CiudadService;

@Service
public class CiudadServiceImpl implements CiudadService {

    @Autowired
    private CiudadRepository ciudadRepository;

    @Override
    public Ciudad crearCiudad(Ciudad ciudad) {
        return this.ciudadRepository.save(ciudad);
    }

    @Override
    public List<Ciudad> listarCiudades() {
        return (List<Ciudad>) this.ciudadRepository.findAll();
    }

}
