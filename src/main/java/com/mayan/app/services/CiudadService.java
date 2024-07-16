package com.mayan.app.services;

import java.util.List;

import com.mayan.app.models.Ciudad;

public interface CiudadService {

    public Ciudad crearCiudad(Ciudad ciudad);

    public List<Ciudad> listarCiudades();

}
