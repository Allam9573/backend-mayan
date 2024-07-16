package com.mayan.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayan.app.models.Aeronave;
import com.mayan.app.repositories.AeronaveRepository;
import com.mayan.app.services.AeronaveService;

@Service
public class AeronaveServiceImpl implements AeronaveService {

    @Autowired
    private AeronaveRepository aeronaveRepository;

    @Override
    public Aeronave crearAeronave(Aeronave aeronave) {
        return this.aeronaveRepository.save(aeronave);
    }

    @Override
    public List<Aeronave> listarAeronaves() {
        return (List<Aeronave>) this.aeronaveRepository.findAll();
    }

    @Override
    public Aeronave buscarAeronave(String nombre) {
        return this.aeronaveRepository.findByModelo(nombre);
    }

    @Override
    public Aeronave buscarAeronave(int id) {
        return this.aeronaveRepository.findById(id).get();
    }

}
