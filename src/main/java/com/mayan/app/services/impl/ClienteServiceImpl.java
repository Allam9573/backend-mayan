package com.mayan.app.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.RSocket.Client;
import org.springframework.stereotype.Service;

import com.mayan.app.models.Cliente;
import com.mayan.app.repositories.ClienteRepository;
import com.mayan.app.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> listarClientes() {
        Iterable<Cliente> iterableClientes = this.clienteRepository.findAll();
        List<Cliente> clientes = new ArrayList<>();
        for(int i = 0; i < clientes.size(); i++){
            if(clientes[i].is)
        }
        return clientes;
    }
    

    @Override
    public Cliente eliminarCliente(int id) {
        Cliente clienteEliminar = this.clienteRepository.findById(id).get();

        if (clienteEliminar != null) {
            clienteEliminar.setActivo(false);
            this.clienteRepository.save(clienteEliminar);
        }
        return clienteEliminar;
    }

    @Override
    public List<Cliente> buscarClientesPorNombre(String nombre) {
        return this.clienteRepository.findByNombre(nombre);
    }

    @Override
    public Cliente reestablecerCliente(int id) {
        Cliente clienteReestablecer = this.clienteRepository.findById(id).get();
        if (clienteReestablecer != null) {
            clienteReestablecer.setActivo(true);
            this.clienteRepository.save(clienteReestablecer);
        }
        return clienteReestablecer;
    }
}
