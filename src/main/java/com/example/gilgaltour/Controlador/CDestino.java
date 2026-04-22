package com.example.gilgaltour.Controlador;

import com.example.gilgaltour.Modelo.Destino;
import com.example.gilgaltour.Servicio.SDestino;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/destinos")
@CrossOrigin(origins = "*")

public class CDestino {

    @Autowired
    SDestino sDestino;

    // Guardar destino
    @PostMapping
    public ResponseEntity<?> guardarDestino(@RequestBody Destino destino) {
        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(sDestino.guardarDestino(destino));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Consultar todos
    @GetMapping
    public ResponseEntity<?> consultarDestinos() {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sDestino.consultarDestinos());
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Consultar por ID
    @GetMapping("/{ideDestino}")
    public ResponseEntity<?> consultarPorId(@PathVariable String ideDestino) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sDestino.consultarPorId(ideDestino));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Consultar por nombre
    @GetMapping("/nombre/{nomDestino}")
    public ResponseEntity<?> consultarPorNombre(@PathVariable String nomDestino) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sDestino.consultarPorNombre(nomDestino));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Modificar destino
    @PutMapping("/{ideDestino}")
    public ResponseEntity<?> modificarDestino(@PathVariable String ideDestino,
                                              @RequestBody Destino destino) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sDestino.modificarDestino(ideDestino, destino));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Eliminar destino
    @DeleteMapping("/{ideDestino}")
    public ResponseEntity<?> eliminarDestino(@PathVariable String ideDestino) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sDestino.eliminarDestino(ideDestino));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}