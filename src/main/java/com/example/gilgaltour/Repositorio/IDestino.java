package com.example.gilgaltour.Repositorio;

import com.example.gilgaltour.Modelo.Destino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDestino extends JpaRepository<Destino,String> {
    List<Destino> findByNomdestino(String Nomdestino);
}
