package com.example.gilgaltour.Repositorio;

import com.example.gilgaltour.Modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICliente extends JpaRepository<Cliente,String> {
    List<Cliente> findByNomCliente(String NomCliente);
}
