package com.example.gilgaltour.Repositorio;

import com.example.gilgaltour.Modelo.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.time.LocalDate;

@Repository
public interface IPago extends JpaRepository<Pago,String> {
    List<Pago> findByMetodoPago(String metodoPago);
    List<Pago> findByEstadoPago(String estadoPago);
    List<Pago> findByIdeReserva(String ideReserva);
    List<Pago> findByFechaPago(LocalDate fechaPago);

}
