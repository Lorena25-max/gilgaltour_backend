package com.example.gilgaltour.Configuracion;

import com.example.gilgaltour.Modelo.Cliente;


import com.example.gilgaltour.Repositorio.ICliente;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class GeneradorCliente implements CommandLineRunner {

    private final ICliente clienteRepositorio;

    public GeneradorCliente(ICliente clienteRepositorio) {
        this.clienteRepositorio = clienteRepositorio;
    }

    @Override
    public void run(String... args) {


    }
}