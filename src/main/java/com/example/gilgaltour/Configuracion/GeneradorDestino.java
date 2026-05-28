package com.example.gilgaltour.Configuracion;

import com.example.gilgaltour.Modelo.Destino;
import com.example.gilgaltour.Repositorio.IDestino;

import com.example.gilgaltour.Repositorio.IDestino;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class GeneradorDestino implements CommandLineRunner {

    private final IDestino destinoRepositorio;

    public GeneradorDestino(IDestino destinoRepositorio) {
        this.destinoRepositorio = destinoRepositorio;
    }

    @Override
    public void run(String... args) {


    }
}