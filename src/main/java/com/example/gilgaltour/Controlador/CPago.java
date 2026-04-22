package com.example.gilgaltour.Controlador;

import com.example.gilgaltour.Modelo.Pago;
import com.example.gilgaltour.Servicio.SPago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pagos")
@CrossOrigin(origins = "*")

public class CPago {

    @Autowired
    SPago sPago;

    // Guardar pago
    @PostMapping
    public ResponseEntity<?> guardarPago(@RequestBody Pago pago) {
        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(sPago.guardarPago(pago));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Consultar todos
    @GetMapping
    public ResponseEntity<?> consultarPagos() {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sPago.consultarPagos());
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Consultar por ID
    @GetMapping("/{idPago}")
    public ResponseEntity<?> consultarPorId(@PathVariable String idPago) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sPago.consultarPorId(idPago));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Consultar por estado
    @GetMapping("/estado/{estadoPago}")
    public ResponseEntity<?> consultarPorEstado(@PathVariable String estadoPago) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sPago.consultarPorEstado(estadoPago));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Consultar por método de pago
    @GetMapping("/metodo/{metodoPago}")
    public ResponseEntity<?> consultarPorMetodo(@PathVariable String metodoPago) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sPago.consultarPorMetodo(metodoPago));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Consultar por reserva
    @GetMapping("/reserva/{ideReserva}")
    public ResponseEntity<?> consultarPorReserva(@PathVariable String ideReserva) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sPago.consultarPorReserva(ideReserva));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Modificar pago
    @PutMapping("/{idPago}")
    public ResponseEntity<?> modificarPago(@PathVariable String idPago,
                                           @RequestBody Pago pago) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sPago.modificarPago(idPago, pago));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Eliminar pago
    @DeleteMapping("/{idPago}")
    public ResponseEntity<?> eliminarPago(@PathVariable String idPago) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sPago.eliminarPago(idPago));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}