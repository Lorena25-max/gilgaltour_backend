package com.example.gilgaltour.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name= "cliente")
public class Cliente {

    //Atributos
    @Id
    @Column(name="idecliente", length = 15, nullable = false)
    String ideCliente;
    @Column(length = 100, nullable = false)
    String nomCliente;
    @Column(length = 100, nullable = false)
    String apellido;
    @Column(length = 15, nullable = false)
    String documento;
    @Column(length = 50, nullable = false)
    String email;
    @Column(length = 10, nullable = false)
    String telCliente;
    @Column(length = 15, nullable = false)
    LocalDate fecha_registro;
    @Column(length = 200, nullable = false)
    String estado;

    //Relaciones

    // Constructores


    public Cliente(String ideCliente, String nomCliente, String apellido, String documento, String email, String telCliente, LocalDate fecha_registro, String estado) {
        this.ideCliente = ideCliente;
        this.nomCliente = nomCliente;
        this.apellido = apellido;
        this.documento = documento;
        this.email = email;
        this.telCliente = telCliente;
        this.fecha_registro = fecha_registro;
        this.estado = estado;
    }

    public Cliente() {
    }

    //Encapsular

    public String getIdeCliente() {
        return ideCliente;
    }

    public void setIdeCliente(String ideCliente) {
        this.ideCliente = ideCliente;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelCliente() {
        return telCliente;
    }

    public void setTelCliente(String telCliente) {
        this.telCliente = telCliente;
    }

    public LocalDate getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(LocalDate fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}



