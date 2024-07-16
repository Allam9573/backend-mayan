package com.mayan.app.services;

import java.util.List;

import com.mayan.app.models.Aeronave;

public interface AeronaveService {

    public Aeronave crearAeronave(Aeronave aeronave);

    public List<Aeronave> listarAeronaves();

    public Aeronave buscarAeronave(String modelo);

    public Aeronave buscarAeronave(int id);

}
