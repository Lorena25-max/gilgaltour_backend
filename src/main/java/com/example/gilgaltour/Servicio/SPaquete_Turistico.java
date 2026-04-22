package com.example.gilgaltour.Servicio;

import com.example.gilgaltour.Modelo.Paquete_Turistico;
import com.example.gilgaltour.Repositorio.IPaquete_Turistico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SPaquete_Turistico {

    @Autowired
    IPaquete_Turistico iPaquete_Turistico;

    public SPaquete_Turistico(IPaquete_Turistico iPaquete_Turistico) {
        this.iPaquete_Turistico = iPaquete_Turistico;
    }

    // Guardar paquete
    public Paquete_Turistico guardarPaquete(Paquete_Turistico paquete_Turistico) throws Exception {
        try {
            return iPaquete_Turistico.save(paquete_Turistico);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Consultar todos
    public List<Paquete_Turistico> consultarPaquetes() throws Exception {
        try {
            return iPaquete_Turistico.findAll();
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Consultar por ID
    public Paquete_Turistico consultarPorId(String idPaquete) throws Exception {
        try {
            Optional<Paquete_Turistico> encontrado = iPaquete_Turistico.findById(idPaquete);
            if (encontrado.isPresent()) {
                return encontrado.get();
            } else {
                throw new Exception("Paquete no encontrado");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Consultar por destino
    public List<Paquete_Turistico> consultarPorDestino(String ideDestino) throws Exception {
        try {
            return iPaquete_Turistico.findByIdeDestino(ideDestino);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Consultar por nombre (búsqueda)
    public List<Paquete_Turistico> consultarPorNombre(String nomPaquete) throws Exception {
        try {
            return iPaquete_Turistico.findByNomPaquete(nomPaquete);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Consultar por rango de precios
    public List<Paquete_Turistico> consultarPorPrecio(Double min, Double max) throws Exception {
        try {
            return iPaquete_Turistico.findByPrecioBetween(min, max);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Modificar paquete
    public Paquete_Turistico modificarPaquete(String idPaquete, Paquete_Turistico paquete) throws Exception {
        try {
            Optional<Paquete_Turistico> encontrado = iPaquete_Turistico.findById(idPaquete);

            if (encontrado.isPresent()) {
                Paquete_Turistico nuevo = encontrado.get();

                nuevo.setNomPaquete(paquete.getNomPaquete());
                nuevo.setIdeDestino(paquete.getIdeDestino());
                nuevo.setDuracion(paquete.getDuracion());
                nuevo.setPrecio(paquete.getPrecio());
                nuevo.setCupos(paquete.getCupos());
                nuevo.setIncluye(paquete.getIncluye());

                return iPaquete_Turistico.save(nuevo);

            } else {
                throw new Exception("No se puede modificar, paquete no existe");
            }

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    //Eliminar paquete
    public boolean eliminarPaquete(String idPaquete) throws Exception {
        try {
            Optional<Paquete_Turistico> encontrado = iPaquete_Turistico.findById(idPaquete);

            if (encontrado.isPresent()) {
                iPaquete_Turistico.deleteById(idPaquete);
                return true;
            } else {
                throw new Exception("No se puede eliminar, paquete no existe");
            }

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}