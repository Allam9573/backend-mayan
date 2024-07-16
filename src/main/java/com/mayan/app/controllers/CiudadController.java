package com.mayan.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mayan.app.models.Ciudad;
import com.mayan.app.services.impl.CiudadServiceImpl;

@RestController
@RequestMapping("/api/ciudades")
public class CiudadController {

    @Autowired
    private CiudadServiceImpl ciudadServiceImpl;

    @GetMapping("")
    public List<Ciudad> listarCiudades() {
        return this.ciudadServiceImpl.listarCiudades();
    }

    @PostMapping("/crear")
    public Ciudad crearCiudad(@RequestBody Ciudad ciudad) {
        return this.ciudadServiceImpl.crearCiudad(ciudad);
    }
}
