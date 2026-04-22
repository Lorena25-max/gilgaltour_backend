package com.example.gilgaltour.Controlador;

import com.example.gilgaltour.Modelo.Paquete_Turistico;
import com.example.gilgaltour.Servicio.SPaquete_Turistico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paquetes")
@CrossOrigin(origins = "*")

public class CPaquete_Turistico {

    @Autowired
    SPaquete_Turistico sPaquete;

    // Guardar paquete
    @PostMapping
    public ResponseEntity<?> guardarPaquete(@RequestBody Paquete_Turistico paquete) {
        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(sPaquete.guardarPaquete(paquete));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Consultar todos
    @GetMapping
    public ResponseEntity<?> consultarPaquetes() {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sPaquete.consultarPaquetes());
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Consultar por ID
    @GetMapping("/{idPaquete}")
    public ResponseEntity<?> consultarPorId(@PathVariable String idPaquete) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sPaquete.consultarPorId(idPaquete));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Consultar por destino
    @GetMapping("/destino/{ideDestino}")
    public ResponseEntity<?> consultarPorDestino(@PathVariable String ideDestino) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sPaquete.consultarPorDestino(ideDestino));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Consultar por nombre
    @GetMapping("/nombre/{nomPaquete}")
    public ResponseEntity<?> consultarPorNombre(@PathVariable String nomPaquete) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sPaquete.consultarPorNombre(nomPaquete));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Consultar por rango de precios
    @GetMapping("/precio")
    public ResponseEntity<?> consultarPorPrecio(@RequestParam Double min,
                                                @RequestParam Double max) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sPaquete.consultarPorPrecio(min, max));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Modificar paquete
    @PutMapping("/{idPaquete}")
    public ResponseEntity<?> modificarPaquete(@PathVariable String idPaquete,
                                              @RequestBody Paquete_Turistico paquete) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sPaquete.modificarPaquete(idPaquete, paquete));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Eliminar paquete
    @DeleteMapping("/{idPaquete}")
    public ResponseEntity<?> eliminarPaquete(@PathVariable String idPaquete) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sPaquete.eliminarPaquete(idPaquete));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}