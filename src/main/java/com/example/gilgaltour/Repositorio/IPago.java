package com.example.gilgaltour.Repositorio;

import com.example.gilgaltour.Modelo.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.time.LocalDate;

@Repository
public interface IPago extends JpaRepository<Pago,String> {
    List<Pago> findByMetodopago(String Metodopago);
    List<Pago> findByEstadopago(String Estadopago);
    List<Pago> findByIdereserva(String Idereserva);
    List<Pago> findByFechapago(LocalDate Fechapago);

}
