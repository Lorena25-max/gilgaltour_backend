package com.example.gilgaltour.Repositorio;

import com.example.gilgaltour.Modelo.Reservas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IReserva extends JpaRepository<Reservas,String> {
    List<Reservas> findByIdecliente(String Idecliente);
    List<Reservas> findByIdepaquete(String Idepaquete);
}
