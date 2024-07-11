package com.mayan.app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.mayan.app.dto.PaisDTO;
import com.mayan.app.models.Pais;
import com.mayan.app.services.impl.PaisServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/paises")
@CrossOrigin(origins = "http://localhost:5173/")
public class PaisController {

    @Autowired
    private PaisServiceImpl paisServiceImpl;

    @GetMapping("")
    public List<Pais> listarPaises() {
        return this.paisServiceImpl.listarPaises();
    }

    @PostMapping("/crear")
    public Pais crearPais(@RequestBody PaisDTO paisDTO) {
        Pais pais = new Pais();
        pais.setNombre(paisDTO.getNombre());
        return this.paisServiceImpl.crearPais(pais);
    }

    @DeleteMapping("/eliminar/{id}")
    public Pais eliminarPais(@PathVariable int id) {
        return this.paisServiceImpl.eliminarPais(id);
    }

}
