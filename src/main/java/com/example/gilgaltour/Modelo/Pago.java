package com.example.gilgaltour.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
@Table(name= "pago")
public class Pago {
    @Id
    @Column(name="idpago", length = 15, nullable = false)
    String idPago;
    @Column(length = 15, nullable = false)
    String ideReserva;
    @Column(length = 15, nullable = false)
    LocalDate fechaPago;
    @Column(length = 50, nullable = false)
    Float totalPagado;
    @Column(length = 10, nullable = false)
    String metodoPago;
    @Column(length = 200, nullable = false)
    String estadoPago;

    //Relaciones

    //Constructores
    public Pago(String idPago, String ideReserva, LocalDate fechaPago, Float totalPagado, String metodoPago, String estadoPago) {
        this.idPago = idPago;
        this.ideReserva = ideReserva;
        this.fechaPago = fechaPago;
        this.totalPagado = totalPagado;
        this.metodoPago = metodoPago;
        this.estadoPago = estadoPago;
    }

    public Pago() {
    }

    //Encapsular

    public String getIdPago() {
        return idPago;
    }

    public void setIdPago(String idPago) {
        this.idPago = idPago;
    }

    public String getIdeReserva() {
        return ideReserva;
    }

    public void setIdeReserva(String ideReserva) {
        this.ideReserva = ideReserva;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Float getTotalPagado() {
        return totalPagado;
    }

    public void setTotalPagado(Float totalPagado) {
        this.totalPagado = totalPagado;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }
}
