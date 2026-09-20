package com.exament1.entidades;

import java.time.LocalDate;

public class Venta {

    private LocalDate fechaRegistro;
    private int cantidad;
    private double total;

    private Libro libro;
    private Cliente cliente;

    // Constructor vacío
    public Venta() {
    }

    // Constructor sobrecargado
    public Venta(LocalDate fechaRegistro, int cantidad, double total) {
        this.fechaRegistro = fechaRegistro;
        this.cantidad = cantidad;
        this.total = total;
    }

    // Métodos
    public double calcularTotal() {
        // Multiplica la cantidad comprada por el precio unitario del libro asociado
        return 0.0;
    }

    public boolean registrarVenta() {
        // Procesa la venta, descuenta el stock del libro y almacena el registro
        return true;
    }

    // Getters + Setters
    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
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
