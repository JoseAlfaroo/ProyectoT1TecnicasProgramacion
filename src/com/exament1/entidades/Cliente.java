package com.exament1.entidades;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente {

    private String nombre;
    private String dni;
    private String correo;
    private boolean registrado;

    public Cliente(String nombre, String dni, String correo) {
        this.nombre = nombre;
        this.dni = dni;
        this.correo = correo;
        this.registrado = false;
    }

    public void registrarCliente() {
        if (nombre == null || nombre.isBlank() || dni == null || dni.isBlank()) {
            throw new IllegalStateException("Nombre y DNI son obligatorios para registrar al cliente.");
        }
        this.registrado = true;
    }

    public void actualizarDatos(String nuevoNombre, String nuevoCorreo) {
        if (nuevoNombre != null && !nuevoNombre.isBlank()) {
            this.nombre = nuevoNombre;
        }
        if (nuevoCorreo != null && !nuevoCorreo.isBlank()) {
            this.correo = nuevoCorreo;
        }
    }

    // ----- Getters -----

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getCorreo() {
        return correo;
    }

    public boolean isRegistrado() {
        return registrado;
    }

    public String toString() {
        return String.format("%s (DNI: %s, %s)", nombre, dni, correo);
    }
}