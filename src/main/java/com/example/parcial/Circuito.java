package com.example.parcial;

import java.util.ArrayList;
import java.util.List;

import com.example.parcial.interfaces.ISponsoreable;

public class Circuito implements ISponsoreable{
    private String nombre;
    private int longitud;
    private int vueltasCantidad;
    private List<SponsorContrato> sponsors;


    public Circuito(String nombre, int longitud, int vueltasCantidad) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.vueltasCantidad = vueltasCantidad;
        this.sponsors = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getLongitud() {
        return longitud;
    }

    public int getVueltasCantidad() {
        return vueltasCantidad;
    }

    public List<SponsorContrato> getSponsors() {
        return sponsors;
    }

    @Override
    public void agregar() {
        
    }

    @Override
    public void agregarSC() {
        
    }

    @Override
    public void removerSponsor() {
        
    }

    @Override
    public void remover() {
        
    }

    @Override
    public void removerSC() {
        
    }

    @Override
    public void sponsorsHabilitados() {
        
    }
    
}
