package com.mayan.app.services;

import java.util.List;

import com.mayan.app.models.Cliente;

public interface ClienteService {

    public Cliente crearCliente(Cliente cliente);

    public List<Cliente> listarClientes();

    public Cliente eliminarCliente(int id);

    public List<Cliente> buscarClientesPorNombre(String nombre);

    public Cliente reestablecerCliente(int id);

}
