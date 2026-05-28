package com.example.gilgaltour.Modelo;

import java.util.List;
import jakarta.persistence.*;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonIgnore;

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

    @Column(length = 255, nullable = false)
    private String password;

    @Column(nullable = false)
    private LocalDate fecha_registro;

    @Column(length = 200, nullable = false)
    private String estado;

    //Relaciones
    @JsonIgnore
    @OneToMany(mappedBy = "cliente")
    private List<Reservas> reservas;


    // Constructor vacío
    public Cliente() {
    }

    // Constructor completo

    public Cliente(String idecliente, String nomcliente, String apellido, String documento, String email, String telcliente, String password, LocalDate fecha_registro, String estado, List<Reservas> reservas) {
        this.idecliente = idecliente;
        this.nomcliente = nomcliente;
        this.apellido = apellido;
        this.documento = documento;
        this.email = email;
        this.telcliente = telcliente;
        this.password = password;
        this.fecha_registro = fecha_registro;
        this.estado = estado;
        this.reservas = reservas;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public List<Reservas> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reservas> reservas) {
        this.reservas = reservas;
    }
}

