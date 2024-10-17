package com.example.parcial;

public class Circuito {
    private String nombre;
    private String longitud;
    private String vueltasCantidad;

    public Circuito(String nombre, String longitud, String vueltasCantidad) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.vueltasCantidad = vueltasCantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLongitud() {
        return longitud;
    }

    public String getVueltasCantidad() {
        return vueltasCantidad;
    }
}
