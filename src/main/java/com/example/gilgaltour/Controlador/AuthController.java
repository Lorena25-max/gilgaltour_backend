package com.example.gilgaltour.Controlador;

import com.example.gilgaltour.Modelo.Cliente;
import com.example.gilgaltour.Repositorio.ICliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:5173")

public class AuthController {

    @Autowired
    private ICliente clienteRepositorio;

    // 🔥 REGISTRO
    @PostMapping("/register")
    public Object register(@RequestBody Cliente cliente) {

        try {

            // 🔥 GENERAR ID AUTOMÁTICO
            long numero =
                    (long)(Math.random() * 9000) + 1000;

            cliente.setIdecliente(
                    "C" + numero
            );

            // 🔥 FECHA AUTOMÁTICA
            cliente.setFecha_registro(
                    LocalDate.now()
            );

            // 🔥 ESTADO
            cliente.setEstado("ACTIVO");

            // 🔥 GUARDAR
            clienteRepositorio.save(cliente);

            // 🔥 RESPUESTA
            Map<String, Object> response =
                    new HashMap<>();

            response.put(
                    "message",
                    "Usuario registrado correctamente"
            );

            response.put(
                    "cliente",
                    cliente
            );

            return response;

        } catch (Exception e) {

            e.printStackTrace();

            Map<String, Object> error =
                    new HashMap<>();

            error.put(
                    "message",
                    "Error registrando usuario"
            );

            error.put(
                    "error",
                    e.getMessage()
            );

            return error;
        }
    }

    // 🔥 LOGIN
    @PostMapping("/login")
    public Object login(
            @RequestBody Map<String, String> data
    ) {

        try {

            String email =
                    data.get("email");

            String password =
                    data.get("password");

            Cliente cliente =
                    clienteRepositorio
                            .findByEmail(email);

            // 🔥 VALIDAR EXISTENCIA
            if (cliente == null) {

                Map<String, Object> error =
                        new HashMap<>();

                error.put(
                        "message",
                        "Usuario no encontrado"
                );

                return error;
            }

            // 🔥 VALIDAR PASSWORD
            if (!cliente.getPassword()
                    .equals(password)) {

                Map<String, Object> error =
                        new HashMap<>();

                error.put(
                        "message",
                        "Contraseña incorrecta"
                );

                return error;
            }

            // 🔥 RESPUESTA LOGIN
            Map<String, Object> response =
                    new HashMap<>();

            response.put(
                    "message",
                    "Login exitoso"
            );

            response.put(
                    "cliente",
                    cliente
            );

            return response;

        } catch (Exception e) {

            e.printStackTrace();

            Map<String, Object> error =
                    new HashMap<>();

            error.put(
                    "message",
                    "Error en login"
            );

            error.put(
                    "error",
                    e.getMessage()
            );

            return error;
        }
    }

}