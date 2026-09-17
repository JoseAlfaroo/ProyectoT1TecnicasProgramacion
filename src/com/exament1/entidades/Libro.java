package com.exament1.entidades;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private double precio;
    private int stock;

    public Libro(String titulo, String autor, String isbn, double precio, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.stock = stock;
    }
    public Libro() {
		
	}
	public void mostrarinfo() {
        System.out.println("Libro: ");
        }

    public boolean verificarStock() {
        return stock > 0;
    }

    public void reducirStock(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a 0.");
        }
        if (cantidad > stock) {
            throw new IllegalStateException(
                "Stock insuficiente para \"" + titulo + "\". Disponible: " + stock);
        }
        stock -= cantidad;
    }

  
    public void aumentarStock(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a 0.");
        }
        stock += cantidad;
    }

    // ----- Getters -----

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return String.format("%s - %s (ISBN: %s) | S/ %.2f | Stock: %d",
                titulo, autor, isbn, precio, stock);
    }
}