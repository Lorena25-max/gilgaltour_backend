package com.example.gilgaltour.Modelo;

import java.util.List;
import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.LocalDate;

@Entity
@Table(name= "pago")
public class Pago {
    @Id
    @Column(length = 15, nullable = false)
    String idpago;
    @Column(length = 15, nullable = false)
    String idereserva;
    @Column(length = 15, nullable = false)
    LocalDate fechapago;
    @Column(length = 50, nullable = false)
    Float totalpagado;
    @Column(length = 50, nullable = false)
    String metodopago;
    @Column(length = 200, nullable = false)
    String estadopago;

    //Relaciones
    @JsonIgnore
    @ManyToOne
    @JoinColumn(insertable = false, updatable = false)
    private Reservas reserva;


    //Constructores


    public Pago(String idpago, String idereserva, LocalDate fechapago, Float totalpagado, String metodopago, String estadopago) {
        this.idpago = idpago;
        this.idereserva = idereserva;
        this.fechapago = fechapago;
        this.totalpagado = totalpagado;
        this.metodopago = metodopago;
        this.estadopago = estadopago;
    }

    public Pago() {
    }

    //Encapsular


    public String getIdpago() {
        return idpago;
    }

    public void setIdpago(String idpago) {
        this.idpago = idpago;
    }

    public String getIdereserva() {
        return idereserva;
    }

    public void setIdereserva(String idereserva) {
        this.idereserva = idereserva;
    }

    public LocalDate getFechapago() {
        return fechapago;
    }

    public void setFechapago(LocalDate fechapago) {
        this.fechapago = fechapago;
    }

    public Float getTotalpagado() {
        return totalpagado;
    }

    public void setTotalpagado(Float totalpagado) {
        this.totalpagado = totalpagado;
    }

    public String getMetodopago() {
        return metodopago;
    }

    public void setMetodopago(String metodopago) {
        this.metodopago = metodopago;
    }

    public String getEstadopago() {
        return estadopago;
    }

    public void setEstadopago(String estadopago) {
        this.estadopago = estadopago;
    }
}
