package com.example.gilgaltour.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name= "reserva")

public class Reservas {
    @Id
    @Column(name="idreserva", length = 15, nullable = false)
    String idReserva;
    @Column(length = 15, nullable = false)
    String ideCliente;
    @Column(length = 15, nullable = false)
    String idePaquete;
    @Column(length = 50, nullable = false)
    LocalDate fechaReserva;
    @Column(length = 50, nullable = false)
    LocalDate fechaViaje;
    @Column(length = 10, nullable = false)
    Double totalPagado;
    @Column(length = 5, nullable = false)
    Integer cantidadPersonas;
    @Column(length = 200, nullable = false)
    String estado;

    //Relaciones

    //Constructores
    public Reservas(String idReserva, String ideCliente, String idePaquete, LocalDate fechaReserva, LocalDate fechaViaje, Double totalPagado, Integer cantidadPersonas, String estado) {
        this.idReserva = idReserva;
        this.ideCliente = ideCliente;
        this.idePaquete = idePaquete;
        this.fechaReserva = fechaReserva;
        this.fechaViaje = fechaViaje;
        this.totalPagado = totalPagado;
        this.cantidadPersonas = cantidadPersonas;
        this.estado = estado;
    }

    public Reservas() {
    }

    //Encapsular

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public String getIdeCliente() {
        return ideCliente;
    }

    public void setIdeCliente(String ideCliente) {
        this.ideCliente = ideCliente;
    }

    public String getIdePaquete() {
        return idePaquete;
    }

    public void setIdePaquete(String idePaquete) {
        this.idePaquete = idePaquete;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public LocalDate getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(LocalDate fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public Double getTotalPagado() {
        return totalPagado;
    }

    public void setTotalPagado(Double totalPagado) {
        this.totalPagado = totalPagado;
    }

    public Integer getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(Integer cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
