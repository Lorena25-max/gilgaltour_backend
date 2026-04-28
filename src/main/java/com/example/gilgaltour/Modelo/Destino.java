package com.example.gilgaltour.Modelo;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name= "destino")
public class Destino {
    //Atributos

    @Id
    @Column(length = 15, nullable = false)
    String idedestino;
    @Column(length = 100, nullable = false)
    String nomdestino;
    @Column(length = 100, nullable = false)
    String ciudad;
    @Column(length = 50, nullable = false)
    String descripcion;
    @Column(length = 10, nullable = false)
    Double precio;
    @Column(length = 5, nullable = false)
    String activo;

    //Relaciones
    @OneToMany(mappedBy = "destino")
    private List<Paquete_Turistico> paquetes;


    // Constructores

    public Destino(String idedestino, String nomdestino, String ciudad, String descripcion, Double precio, String activo) {
        this.idedestino = idedestino;
        this.nomdestino = nomdestino;
        this.ciudad = ciudad;
        this.descripcion = descripcion;
        this.precio = precio;
        this.activo = activo;
    }

    public Destino() {
    }

    //Encapsular


    public String getIdedestino() {
        return idedestino;
    }

    public void setIdedestino(String idedestino) {
        this.idedestino = idedestino;
    }

    public String getNomdestino() {
        return nomdestino;
    }

    public void setNomdestino(String nomdestino) {
        this.nomdestino = nomdestino;
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
