package com.example.gilgaltour.Controlador;

import com.example.gilgaltour.Modelo.Reservas;
import com.example.gilgaltour.Servicio.SReservas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservas")
@CrossOrigin(origins = "*")

public class CReservas {

    @Autowired
    SReservas sReservas;

    // Guardar reserva
    @PostMapping
    public ResponseEntity<?> guardarReserva(@RequestBody Reservas reserva) {
        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(sReservas.guardarReserva(reserva));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Consultar todas
    @GetMapping
    public ResponseEntity<?> consultarReservas() {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sReservas.consultarReservas());
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Consultar por ID
    @GetMapping("/{idReserva}")
    public ResponseEntity<?> consultarPorId(@PathVariable String idReserva) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sReservas.consultarPorId(idReserva));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Consultar por cliente
    @GetMapping("/cliente/{ideCliente}")
    public ResponseEntity<?> consultarPorCliente(@PathVariable String ideCliente) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sReservas.consultarPorCliente(ideCliente));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Consultar por paquete
    @GetMapping("/paquete/{idePaquete}")
    public ResponseEntity<?> consultarPorPaquete(@PathVariable String idePaquete) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sReservas.consultarPorPaquete(idePaquete));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Modificar reserva
    @PutMapping("/{idReserva}")
    public ResponseEntity<?> modificarReserva(@PathVariable String idReserva,
                                              @RequestBody Reservas reserva) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sReservas.modificarReserva(idReserva, reserva));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Eliminar reserva
    @DeleteMapping("/{idReserva}")
    public ResponseEntity<?> eliminarReserva(@PathVariable String idReserva) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sReservas.eliminarReserva(idReserva));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}