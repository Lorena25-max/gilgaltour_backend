package com.example.gilgaltour.Repositorio;

import com.example.gilgaltour.Modelo.Paquete_Turistico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPaquete_Turistico extends JpaRepository<Paquete_Turistico, String>{
    List<Paquete_Turistico> findByIdeDestino(String ideDestino);
    List<Paquete_Turistico> findByNomPaquete(String nomPaquete);
    List<Paquete_Turistico> findByPrecioBetween(Double min, Double max);
    List<Paquete_Turistico> findByIdeDestino(Integer ideDestino);
}
