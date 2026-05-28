package com.example.gilgaltour.Configuracion;

import com.example.gilgaltour.Modelo.Pago;
import com.example.gilgaltour.Repositorio.IPago;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class GeneradorPago implements CommandLineRunner {

    private final IPago pagoRepositorio;

    public GeneradorPago(IPago pagoRepositorio) {
        this.pagoRepositorio = pagoRepositorio;
    }

    @Override
    public void run(String... args) {


    }
}