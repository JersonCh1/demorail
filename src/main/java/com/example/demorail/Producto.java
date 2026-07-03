package com.example.demorail;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Producto {

    @Id
    private int id;

    private String descripcion;

    private double precio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}