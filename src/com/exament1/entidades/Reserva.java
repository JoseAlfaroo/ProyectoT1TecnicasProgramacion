package com.exament1.entidades;

import java.time.LocalDate;

public class Reserva {

    private LocalDate fecha;
    private boolean activa;
    private Cliente cliente;
    private Libro libro;

    public Reserva(LocalDate fecha, Cliente cliente, Libro libro) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.libro = libro;
        this.activa = false;
    }

    public Reserva() {
    }

    public void registrarReserva() {
        if (cliente == null || libro == null) {
            throw new IllegalStateException("Cliente y libro son obligatorios para registrar la reserva.");
        }
        if (!cliente.isRegistrado()) {
            throw new IllegalStateException("El cliente no está registrado.");
        }
        if (!libro.verificarStock()) {
            throw new IllegalStateException("No hay stock disponible para \"" + libro.getTitulo() + "\".");
        }
        if (activa) {
            throw new IllegalStateException("La reserva ya se encuentra activa.");
        }
        if (fecha == null) {
            this.fecha = LocalDate.now();
        }
        libro.reducirStock(1);
        this.activa = true;
    }

    public void cancelarReserva() {
        if (!activa) {
            throw new IllegalStateException("No se puede cancelar una reserva que no está activa.");
        }
        libro.aumentarStock(1);
        this.activa = false;
    }

    // ----- Getters -----
    public LocalDate getFecha() {
        return fecha;
    }

    public boolean isActiva() {
        return activa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Libro getLibro() {
        return libro;
    }

    @Override
    public String toString() {
        return String.format("Reserva %s | %s | %s | Estado: %s",
                fecha, cliente.getNombre(), libro.getTitulo(), activa ? "Activa" : "Cancelada");
    }
}
