package com.example.parcial;

import com.example.parcial.interfaces.INombreParaLED;

public class Sponsor 
            implements INombreParaLED{

    private String nombre;

    public Sponsor(String nombre) {
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

///////////////////////////////////////777
    @Override
    public String getNombreParaLED() {
        return "Sponsor " + nombre;
    }
}
