package com.mayan.app.services;

import java.util.List;

import com.mayan.app.models.Pais;

public interface PaisService {

    public Pais crearPais(Pais pais);

    public List<Pais> listarPaises();

    public Pais eliminarPais(int id);
}
