package com.mayan.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mayan.app.dto.ClienteDTO;
import com.mayan.app.models.Cliente;
import com.mayan.app.services.impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @GetMapping("")
    public List<Cliente> listarClientes() {
        return this.clienteServiceImpl.listarClientes();
    }

    @PostMapping("/crear")
    public Cliente crearCliente(@RequestBody ClienteDTO clienteDTO) {
        Cliente nuevoCliente = new Cliente();
        nuevoCliente.setNombre(clienteDTO.getNombre());
        nuevoCliente.setTelefono(clienteDTO.getTelefono());
        nuevoCliente.setCorreo(clienteDTO.getCorreo());
        nuevoCliente.setDireccion(clienteDTO.getDireccion());
        nuevoCliente.setNacionalidad(clienteDTO.getNacionalidad());
        nuevoCliente.setPasaporte(clienteDTO.getPasaporte());
        nuevoCliente.setActivo(true);
        return this.clienteServiceImpl.crearCliente(nuevoCliente);
    }

    @GetMapping("/buscar/{nombre}")
    public List<Cliente> buscarPorNombre(@PathVariable String nombre) {
        return this.clienteServiceImpl.buscarClientesPorNombre(nombre);
    }

    @GetMapping("/reestablecer/{id}")
    public Cliente reestablecerCliente(@PathVariable int id) {
        return this.clienteServiceImpl.reestablecerCliente(id);
    }

    @GetMapping("/eliminar/{id}")
    public Cliente eliminarCliente(@PathVariable int id) {
        return this.clienteServiceImpl.eliminarCliente(id);
    }

}
