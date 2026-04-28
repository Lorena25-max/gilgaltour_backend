package com.example.gilgaltour.Servicio;

import com.example.gilgaltour.Modelo.Reservas;
import com.example.gilgaltour.Repositorio.IReserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class SReservas {

    @Autowired
    IReserva iReserva;

    public SReservas(IReserva iReserva) {
        this.iReserva = iReserva;
    }

    // Guardar reserva
    public Reservas guardarReserva(Reservas reserva) throws Exception {
        try {
            return iReserva.save(reserva);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Consultar todas
    public List<Reservas> consultarReservas() throws Exception {
        try {
            return iReserva.findAll();
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Consultar por ID
    public Reservas consultarPorId(String idReserva) throws Exception {
        try {
            Optional<Reservas> encontrado = iReserva.findById(idReserva);
            if (encontrado.isPresent()) {
                return encontrado.get();
            } else {
                throw new Exception("Reserva no encontrada");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Consultar por cliente
    public List<Reservas> consultarPorCliente(String ideCliente) throws Exception {
        try {
            return iReserva.findByIdecliente(ideCliente);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Consultar por paquete
    public List<Reservas> consultarPorPaquete(String idePaquete) throws Exception {
        try {
            return iReserva.findByIdepaquete(idePaquete);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Modificar reserva
    public Reservas modificarReserva(String idReserva, Reservas reserva) throws Exception {
        try {
            Optional<Reservas> encontrado = iReserva.findById(idReserva);

            if (encontrado.isPresent()) {
                Reservas nuevo = encontrado.get();

                nuevo.setIdecliente(reserva.getIdecliente());
                nuevo.setIdepaquete(reserva.getIdepaquete());
                nuevo.setFechareserva(reserva.getFechareserva());
                nuevo.setFechaviaje(reserva.getFechaviaje());
                nuevo.setTotalpagado(reserva.getTotalpagado());
                nuevo.setCantidadpersonas(reserva.getCantidadpersonas());
                nuevo.setEstado(reserva.getEstado());

                return iReserva.save(nuevo);

            } else {
                throw new Exception("No se puede modificar, reserva no existe");
            }

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Eliminar reserva
    public boolean eliminarReserva(String idReserva) throws Exception {
        try {
            Optional<Reservas> encontrado = iReserva.findById(idReserva);

            if (encontrado.isPresent()) {
                iReserva.deleteById(idReserva);
                return true;
            } else {
                throw new Exception("No se puede eliminar, reserva no existe");
            }

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}