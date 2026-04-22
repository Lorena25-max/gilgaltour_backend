package com.example.gilgaltour.Servicio;

import com.example.gilgaltour.Modelo.Destino;
import com.example.gilgaltour.Repositorio.IDestino;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.List;
import java.util.Optional;

@Service
public class SDestino {

    @Autowired
    IDestino iDestino;

    public SDestino(IDestino iDestino) {
        this.iDestino = iDestino;
    }

    // Guardar destino
    public Destino guardarDestino(Destino destino) throws Exception {
        try {
            return iDestino.save(destino);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Consultar todos
    public List<Destino> consultarDestinos() throws Exception {
        try {
            return iDestino.findAll();
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Consultar por ID
    public Destino consultarPorId(String ideDestino) throws Exception {
        try {
            Optional<Destino> encontrado = iDestino.findById(ideDestino);
            if (encontrado.isPresent()) {
                return encontrado.get();
            } else {
                throw new Exception("Destino no encontrado");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Consultar por nombre
    public List<Destino> consultarPorNombre(String nomDestino) throws Exception {
        try {
            return iDestino.findByNomDestino(nomDestino);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Modificar destino
    public Destino modificarDestino(String ideDestino, Destino destino) throws Exception {
        try {
            Optional<Destino> encontrado = iDestino.findById(ideDestino);

            if (encontrado.isPresent()) {
                Destino nuevo = encontrado.get();

                nuevo.setNomDestino(destino.getNomDestino());
                nuevo.setCiudad(destino.getCiudad());
                nuevo.setDescripcion(destino.getDescripcion());
                nuevo.setPrecio(destino.getPrecio());
                nuevo.setActivo(destino.getActivo());

                return iDestino.save(nuevo);

            } else {
                throw new Exception("No se puede modificar, destino no existe");
            }

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Eliminar destino
    public boolean eliminarDestino(String ideDestino) throws Exception {
        try {
            Optional<Destino> encontrado = iDestino.findById(ideDestino);

            if (encontrado.isPresent()) {
                iDestino.deleteById(ideDestino);
                return true;
            } else {
                throw new Exception("No se puede eliminar, destino no existe");
            }

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}