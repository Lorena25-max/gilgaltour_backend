package com.example.gilgaltour.Modelo;

import java.util.List;
import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
@Table(name= "paquete_turistico")
public class Paquete_Turistico {
    @Id
    @Column(length = 15, nullable = false)
    String idpaquete;
    @Column(length = 100, nullable = false)
    String nompaquete;
    @Column(length = 15, nullable = false)
    String idedestino;
    @Column(length = 50, nullable = false)
    String duracion;
    @Column(length = 10, nullable = false)
    Double precio;
    @Column(length = 5, nullable = false)
    Integer cupos;
    @Column(length = 200, nullable = false)
    String incluye;

    //Relaciones
    @OneToMany(mappedBy = "paquete")
    private List<Reservas> reservas;

    @ManyToOne
    @JoinColumn(insertable = false, updatable = false)
    private Destino destino;



    //Constructores


    public Paquete_Turistico(String idpaquete, String nompaquete, String idedestino, String duracion, Double precio, Integer cupos, String incluye) {
        this.idpaquete = idpaquete;
        this.nompaquete = nompaquete;
        this.idedestino = idedestino;
        this.duracion = duracion;
        this.precio = precio;
        this.cupos = cupos;
        this.incluye = incluye;
    }

    public Paquete_Turistico() {
    }

    //Encapsular

    public String getIdpaquete() {
        return idpaquete;
    }

    public void setIdpaquete(String idpaquete) {
        this.idpaquete = idpaquete;
    }

    public String getNompaquete() {
        return nompaquete;
    }

    public void setNompaquete(String nompaquete) {
        this.nompaquete = nompaquete;
    }

    public String getIdedestino() {
        return idedestino;
    }

    public void setIdedestino(String idedestino) {
        this.idedestino = idedestino;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCupos() {
        return cupos;
    }

    public void setCupos(Integer cupos) {
        this.cupos = cupos;
    }

    public String getIncluye() {
        return incluye;
    }

    public void setIncluye(String incluye) {
        this.incluye = incluye;
    }
}
