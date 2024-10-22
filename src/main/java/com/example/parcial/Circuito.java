package com.example.parcial;

import java.util.ArrayList;
import java.util.List;

import com.example.parcial.interfaces.ISponsoreable;

public class Circuito 
    implements ISponsoreable{

    private String nombre;
    private int longitud;
    private int vueltasCantidad;
    private List<SponsorContrato> sponsors;


    public Circuito(String nombre, int longitud, int vueltasCantidad) {
        setNombre(nombre);
        setLongitud(longitud);
        setVueltasCantidad(vueltasCantidad);
        setSponsors(sponsors);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getVueltasCantidad() {
        return vueltasCantidad;
    }

    public void setVueltasCantidad(int vueltasCantidad) {
        this.vueltasCantidad = vueltasCantidad;
    }

    public List<SponsorContrato> getSponsors() {
        return sponsors;
    }

    public void setSponsors(List<SponsorContrato> sponsors) {
        this.sponsors = sponsors;
    }

////////////////////////////////////////////////////////////////
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
