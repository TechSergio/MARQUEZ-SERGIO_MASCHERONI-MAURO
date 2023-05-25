package com.parcial.entity;

public class Odontologo {

    private int id;
    private int nroDeMatricula;
    private String nombre;
    private String apellido;

    // Constructor con id
    public Odontologo(int id, int nroDeMatricula, String nombre, String apellido) {
        this.id = id;
        this.nroDeMatricula = nroDeMatricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Constructor sin id
    public Odontologo(int nroDeMatricula, String nombre, String apellido) {
        this.nroDeMatricula = nroDeMatricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNroDeMatricula() {
        return nroDeMatricula;
    }

    public void setNroDeMatricula(int nroDeMatricula) {
        this.nroDeMatricula = nroDeMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // toString

    @Override
    public String toString() {
        return "Odontologo: " +
                "id: " + id +
                ", nroDeMatricula: " + nroDeMatricula +
                ", nombre: '" + nombre + '\'' +
                ", apellido: '" + apellido + '\'';
    }
}
