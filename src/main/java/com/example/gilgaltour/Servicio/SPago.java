package com.example.gilgaltour.Servicio;

import com.example.gilgaltour.Modelo.Pago;
import com.example.gilgaltour.Repositorio.IPago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class SPago {

    @Autowired
    IPago iPago;

    public SPago(IPago iPago) {
        this.iPago = iPago;
    }

    // Guardar pago
    public Pago guardarPago(Pago pago) throws Exception {
        try {
            return iPago.save(pago);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Consultar todos
    public List<Pago> consultarPagos() throws Exception {
        try {
            return iPago.findAll();
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Consultar por ID
    public Pago consultarPorId(String idPago) throws Exception {
        try {
            Optional<Pago> encontrado = iPago.findById(idPago);
            if (encontrado.isPresent()) {
                return encontrado.get();
            } else {
                throw new Exception("Pago no encontrado");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Consultar por estado
    public List<Pago> consultarPorEstado(String Estadopago) throws Exception {
        try {
            return iPago.findByEstadopago(Estadopago);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Consultar por método de pago
    public List<Pago> consultarPorMetodo(String Metodopago) throws Exception {
        try {
            return iPago.findByMetodopago(Metodopago);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Consultar por reserva
    public List<Pago> consultarPorReserva(String Idereserva) throws Exception {
        try {
            return iPago.findByIdereserva(Idereserva);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Modificar pago
    public Pago modificarPago(String idPago, Pago pago) throws Exception {
        try {
            Optional<Pago> encontrado = iPago.findById(idPago);

            if (encontrado.isPresent()) {
                Pago nuevo = encontrado.get();

                nuevo.setIdereserva(pago.getIdereserva());
                nuevo.setFechapago(pago.getFechapago());
                nuevo.setTotalpagado(pago.getTotalpagado());
                nuevo.setMetodopago(pago.getMetodopago());
                nuevo.setEstadopago(pago.getEstadopago());

                return iPago.save(nuevo);

            } else {
                throw new Exception("No se puede modificar, pago no existe");
            }

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Eliminar pago
    public boolean eliminarPago(String idPago) throws Exception {
        try {
            Optional<Pago> encontrado = iPago.findById(idPago);

            if (encontrado.isPresent()) {
                iPago.deleteById(idPago);
                return true;
            } else {
                throw new Exception("No se puede eliminar, pago no existe");
            }

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}