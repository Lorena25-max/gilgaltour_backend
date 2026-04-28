package com.example.gilgaltour.Modelo;

import java.util.List;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @Column(length = 15, nullable = false)
    private String idecliente;

    @Column(length = 100, nullable = false)
    private String nomcliente;

    @Column(length = 100, nullable = false)
    private String apellido;

    @Column(length = 15, nullable = false)
    private String documento;

    @Column(length = 50, nullable = false)
    private String email;

    @Column(length = 10, nullable = false)
    private String telcliente;

    @Column(nullable = false)
    private LocalDate fecha_registro;

    @Column(length = 200, nullable = false)
    private String estado;

    //Relaciones
    @OneToMany(mappedBy = "cliente")
    private List<Reservas> reservas;


    // Constructor vacío
    public Cliente() {
    }

    // Constructor completo
    public Cliente(String idecliente, String nomcliente, String apellido,
                   String documento, String email, String telcliente,
                   LocalDate fecha_registro, String estado) {
        this.idecliente = idecliente;
        this.nomcliente = nomcliente;
        this.apellido = apellido;
        this.documento = documento;
        this.email = email;
        this.telcliente = telcliente;
        this.fecha_registro = fecha_registro;
        this.estado = estado;
    }

    // GETTERS Y SETTERS

    public String getIdecliente() {
        return idecliente;
    }

    public void setIdecliente(String idecliente) {
        this.idecliente = idecliente;
    }

    public String getNomcliente() {
        return nomcliente;
    }

    public void setNomcliente(String nomcliente) {
        this.nomcliente = nomcliente;
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

    public String getTelcliente() {
        return telcliente;
    }

    public void setTelcliente(String telcliente) {
        this.telcliente = telcliente;
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

