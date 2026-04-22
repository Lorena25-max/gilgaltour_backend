package com.example.gilgaltour.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
@Table(name= "destino")
public class Destino {
    //Atributos

    @Id
    @Column(name="idedestino", length = 15, nullable = false)
    String ideDestino;
    @Column(length = 100, nullable = false)
    String nomDestino;
    @Column(length = 100, nullable = false)
    String ciudad;
    @Column(length = 50, nullable = false)
    String descripcion;
    @Column(length = 10, nullable = false)
    Double precio;
    @Column(length = 5, nullable = false)
    String activo;

    //Relaciones

    // Constructores

    public Destino(String ideDestino, String nomDestino, String ciudad, String descripcion, Double precio, String activo) {
        this.ideDestino = ideDestino;
        this.nomDestino = nomDestino;
        this.ciudad = ciudad;
        this.descripcion = descripcion;
        this.precio = precio;
        this.activo = activo;
    }

    public Destino() {
    }

    //Encapsular

    public String getIdeDestino() {
        return ideDestino;
    }

    public void setIdeDestino(String ideDestino) {
        this.ideDestino = ideDestino;
    }

    public String getNomDestino() {
        return nomDestino;
    }

    public void setNomDestino(String nomDestino) {
        this.nomDestino = nomDestino;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }
}
