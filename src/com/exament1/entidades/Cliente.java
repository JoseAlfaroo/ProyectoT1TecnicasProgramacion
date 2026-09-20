package com.exament1.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombre;
    private String dni;
    private String correo;
    private LocalDate fechaRegistro;

    private List<Venta> ventas;
    private List<Reserva> reservas;

    // Constructor vacío
    public Cliente() {
        this.ventas = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    // Constructor sobrecargado
    public Cliente(String nombre, String dni, String correo) {
        this.nombre = nombre;
        this.dni = dni;
        this.correo = correo;
        this.fechaRegistro = LocalDate.now();
        this.ventas = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    // Métodos
    public boolean registrarCliente() {
        // Guarda el alta del cliente en el sistema tras validar sus datos obligatorios
        return true;
    }

    public boolean actualizarDatos() {
        // Modifica la información de contacto registrada del cliente
        return true;
    }

    // Getters + Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}