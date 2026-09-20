package com.exament1.entidades;

import java.time.LocalDate;

public class Reserva {

    private LocalDate fechaRegistro;
    private boolean activa;
    private LocalDate fechaCancelacion;
    private String motivoCancelacion;

    private Libro libro;
    private Cliente cliente;

    // Constructor vacío
    public Reserva() {
    }

    // Constructor sobrecargado
    public Reserva(LocalDate fechaRegistro, boolean activa) {
        this.fechaRegistro = fechaRegistro;
        this.activa = activa;
    }

    // Métodos
    public boolean registrarReserva() {
        // Crea una reserva en estado activo asociada a un cliente y un libro agotado
        return true;
    }

    public boolean cancelarReserva() {
        // Inactiva la reserva actual registrando la fecha y motivo de cancelación
        return true;
    }

    // Getters + Setters
    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public LocalDate getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(LocalDate fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public String getMotivoCancelacion() {
        return motivoCancelacion;
    }

    public void setMotivoCancelacion(String motivoCancelacion) {
        this.motivoCancelacion = motivoCancelacion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
