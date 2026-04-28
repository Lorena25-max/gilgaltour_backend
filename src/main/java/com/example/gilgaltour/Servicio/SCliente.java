package com.example.gilgaltour.Servicio;

import com.example.gilgaltour.Modelo.Cliente;
import com.example.gilgaltour.Repositorio.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SCliente {

    @Autowired
    ICliente iCliente;

    public SCliente(ICliente iCliente) {
        this.iCliente = iCliente;
    }

    // Guardar cliente
    public Cliente guardarCliente(Cliente cliente) throws Exception {
        try {
            return iCliente.save(cliente);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Consultar todos
    public List<Cliente> consultarClientes() throws Exception {
        try {
            return iCliente.findAll();
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Consultar por ID
    public Cliente consultarPorId(String ideCliente) throws Exception {
        try {
            Optional<Cliente> encontrado = iCliente.findById(ideCliente);
            if (encontrado.isPresent()) {
                return encontrado.get();
            } else {
                throw new Exception("Cliente no encontrado");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Consultar por nombre
    public List<Cliente> consultarPorNombre(String nomCliente) throws Exception {
        try {
            return iCliente.findByNomcliente(nomCliente);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Modificar cliente
    public Cliente modificarCliente(String ideCliente, Cliente cliente) throws Exception {
        try {
            Optional<Cliente> encontrado = iCliente.findById(ideCliente);

            if (encontrado.isPresent()) {
                Cliente nuevo = encontrado.get();

                nuevo.setNomcliente(cliente.getNomcliente());
                nuevo.setApellido(cliente.getApellido());
                nuevo.setDocumento(cliente.getDocumento());
                nuevo.setEmail(cliente.getEmail());
                nuevo.setTelcliente(cliente.getTelcliente());
                nuevo.setFecha_registro(cliente.getFecha_registro());
                nuevo.setEstado(cliente.getEstado());

                return iCliente.save(nuevo);

            } else {
                throw new Exception("No se puede modificar, cliente no existe");
            }

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Eliminar cliente
    public boolean eliminarCliente(String ideCliente) throws Exception {
        try {
            Optional<Cliente> encontrado = iCliente.findById(ideCliente);

            if (encontrado.isPresent()) {
                iCliente.deleteById(ideCliente);
                return true;
            } else {
                throw new Exception("No se puede eliminar, cliente no existe");
            }

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}