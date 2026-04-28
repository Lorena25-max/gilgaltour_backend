package com.example.gilgaltour.Modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name= "reserva")

public class Reservas {
    @Id
    @Column(length = 15, nullable = false)
    String idreserva;
    @Column(length = 15, nullable = false)
    String idecliente;
    @Column(length = 15, nullable = false)
    String idepaquete;
    @Column(length = 50, nullable = false)
    LocalDate fechareserva;
    @Column(length = 50, nullable = false)
    LocalDate fechaviaje;
    @Column(length = 10, nullable = false)
    Double totalpagado;
    @Column(length = 5, nullable = false)
    Integer cantidadpersonas;
    @Column(length = 200, nullable = false)
    String estado;

    //Relaciones
    @ManyToOne
    @JoinColumn(insertable = false, updatable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(insertable = false, updatable = false)
    private Paquete_Turistico paquete;

    @OneToMany(mappedBy = "reserva")
    private List<Pago> pagos;



    //Constructores


    public Reservas(String idreserva, String idecliente, String idepaquete, LocalDate fechareserva, LocalDate fechaviaje, Double totalpagado, Integer cantidadpersonas, String estado, Cliente cliente) {
        this.idreserva = idreserva;
        this.idecliente = idecliente;
        this.idepaquete = idepaquete;
        this.fechareserva = fechareserva;
        this.fechaviaje = fechaviaje;
        this.totalpagado = totalpagado;
        this.cantidadpersonas = cantidadpersonas;
        this.estado = estado;
    }

    public Reservas() {
    }

    //Encapsular


    public String getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(String idreserva) {
        this.idreserva = idreserva;
    }

    public String getIdecliente() {
        return idecliente;
    }

    public void setIdecliente(String idecliente) {
        this.idecliente = idecliente;
    }

    public String getIdepaquete() {
        return idepaquete;
    }

    public void setIdepaquete(String idepaquete) {
        this.idepaquete = idepaquete;
    }

    public LocalDate getFechareserva() {
        return fechareserva;
    }

    public void setFechareserva(LocalDate fechareserva) {
        this.fechareserva = fechareserva;
    }

    public LocalDate getFechaviaje() {
        return fechaviaje;
    }

    public void setFechaviaje(LocalDate fechaviaje) {
        this.fechaviaje = fechaviaje;
    }

    public Double getTotalpagado() {
        return totalpagado;
    }

    public void setTotalpagado(Double totalpagado) {
        this.totalpagado = totalpagado;
    }

    public Integer getCantidadpersonas() {
        return cantidadpersonas;
    }

    public void setCantidadpersonas(Integer cantidadpersonas) {
        this.cantidadpersonas = cantidadpersonas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
