package com.mayan.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayan.app.models.Pais;
import com.mayan.app.repositories.PaisRepository;
import com.mayan.app.services.PaisService;

@Service
public class PaisServiceImpl implements PaisService {

    @Autowired
    private PaisRepository paisRepository;

    @Override
    public Pais crearPais(Pais pais) {
        return this.paisRepository.save(pais);
    }

    @Override
    public List<Pais> listarPaises() {
        return (List<Pais>) this.paisRepository.findAll();
    }

    @Override
    public Pais eliminarPais(int id) {
        Pais paisEliminar = this.paisRepository.findById(id).get();
        if (paisEliminar != null) {
            this.paisRepository.delete(paisEliminar);
        }
        return paisEliminar;
    }

}
