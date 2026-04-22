package com.example.gilgaltour.Modelo;


import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
@Table(name= "paquete_turistico")
public class Paquete_Turistico {
    @Id
    @Column(name="idpaquete", length = 15, nullable = false)
    String idPaquete;
    @Column(length = 100, nullable = false)
    String nomPaquete;
    @Column(length = 15, nullable = false)
    String ideDestino;
    @Column(length = 50, nullable = false)
    String duracion;
    @Column(length = 10, nullable = false)
    Double precio;
    @Column(length = 5, nullable = false)
    Integer cupos;
    @Column(length = 200, nullable = false)
    String incluye;

    //Relaciones

    //Constructores

    public Paquete_Turistico(String idPaquete, String nomPaquete, String ideDestino, String duracion, Double precio, Integer cupos, String incluye) {
        this.idPaquete = idPaquete;
        this.nomPaquete = nomPaquete;
        this.ideDestino = ideDestino;
        this.duracion = duracion;
        this.precio = precio;
        this.cupos = cupos;
        this.incluye = incluye;
    }

    public Paquete_Turistico() {
    }

    //Encapsular

    public String getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(String idPaquete) {
        this.idPaquete = idPaquete;
    }

    public String getNomPaquete() {
        return nomPaquete;
    }

    public void setNomPaquete(String nomPaquete) {
        this.nomPaquete = nomPaquete;
    }

    public String getIdeDestino() {
        return ideDestino;
    }

    public void setIdeDestino(String ideDestino) {
        this.ideDestino = ideDestino;
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
