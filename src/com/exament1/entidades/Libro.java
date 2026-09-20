package com.exament1.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private double precio;
    private int stock;
    private LocalDate fechaRegistro;

    private List<Venta> ventas;
    private List<Reserva> reservas;

    // Constructor vacío
    public Libro() {
        this.ventas = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    // Constructor sobrecargado
    public Libro(String titulo, String autor, String isbn, double precio, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.stock = stock;
        this.fechaRegistro = LocalDate.now();
        this.ventas = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    // Métodos
    public boolean verificarStock(int cantidad) {
        // Valida si el stock disponible es suficiente para atender la cantidad solicitada
        return true;
    }

    public void reducirStock(int cantidad) {
        // Descuenta la cantidad especificada del inventario actual del libro
    }

    public void aumentarStock(int cantidad) {
        // Incrementa la cantidad de unidades al inventario del libro tras un reabastecimiento
    }

    // Getters + Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
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