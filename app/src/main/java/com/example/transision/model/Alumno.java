package com.example.transision.model;

import java.io.Serializable;

public class Alumno implements Serializable {
    String nombre,numCuenta;

    public Alumno(String nombre, String numCuenta) {
        this.nombre = nombre;
        this.numCuenta = numCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
}
