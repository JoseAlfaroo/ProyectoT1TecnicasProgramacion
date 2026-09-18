package com.exament1.entidades;

import java.time.LocalDate;

public class Venta {

    private LocalDate fecha;
    private int cantidad;
    private double total;
    private Cliente cliente;
    private Libro libro;

    public Venta(LocalDate fecha, int cantidad, Cliente cliente, Libro libro) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.cliente = cliente;
        this.libro = libro;
        this.total = 0;
    }

    public Venta() {
    }

    public double calcularTotal() {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a 0.");
        }
        if (libro == null) {
            throw new IllegalStateException("La venta no tiene un libro asociado.");
        }
        this.total = libro.getPrecio() * cantidad;
        return total;
    }

    public void registrarVenta() {
        if (cliente == null || libro == null) {
            throw new IllegalStateException("Cliente y libro son obligatorios para registrar la venta.");
        }
        if (!cliente.isRegistrado()) {
            throw new IllegalStateException("El cliente no está registrado.");
        }
        if (!libro.verificarStock()) {
            throw new IllegalStateException("No hay stock disponible para \"" + libro.getTitulo() + "\".");
        }
        if (fecha == null) {
            this.fecha = LocalDate.now();
        }
        libro.reducirStock(cantidad);
        calcularTotal();
    }

    // ----- Getters -----
    public LocalDate getFecha() {
        return fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getTotal() {
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Libro getLibro() {
        return libro;
    }

    @Override
    public String toString() {
        return String.format("Venta %s | %s | %s | Cantidad: %d | Total: S/ %.2f",
                fecha, cliente.getNombre(), libro.getTitulo(), cantidad, total);
    }
}
