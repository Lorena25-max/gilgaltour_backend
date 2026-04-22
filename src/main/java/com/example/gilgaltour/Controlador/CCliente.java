package com.example.gilgaltour.Controlador;

import com.example.gilgaltour.Modelo.Cliente;
import com.example.gilgaltour.Servicio.SCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "*")

public class CCliente {

    @Autowired
    SCliente sCliente;

    // Guardar cliente
    @PostMapping
    public ResponseEntity<?> guardarCliente(@RequestBody Cliente cliente) {
        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(sCliente.guardarCliente(cliente));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Consultar todos
    @GetMapping
    public ResponseEntity<?> consultarClientes() {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sCliente.consultarClientes());
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Consultar por ID
    @GetMapping("/{ideCliente}")
    public ResponseEntity<?> consultarPorId(@PathVariable String ideCliente) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sCliente.consultarPorId(ideCliente));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Consultar por nombre
    @GetMapping("/nombre/{nomCliente}")
    public ResponseEntity<?> consultarPorNombre(@PathVariable String nomCliente) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sCliente.consultarPorNombre(nomCliente));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Modificar cliente
    @PutMapping("/{ideCliente}")
    public ResponseEntity<?> modificarCliente(@PathVariable String ideCliente,
                                              @RequestBody Cliente cliente) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sCliente.modificarCliente(ideCliente, cliente));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Eliminar cliente
    @DeleteMapping("/{ideCliente}")
    public ResponseEntity<?> eliminarCliente(@PathVariable String ideCliente) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(sCliente.eliminarCliente(ideCliente));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}