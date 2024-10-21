package com.example.parcial;

import com.example.parcial.interfaces.ISponsoreable;
import java.util.ArrayList;
import java.util.List;

public class Equipo implements ISponsoreable{
    private String nombre;
    private List<Piloto> pilotos;
    private List<Mecanico> mecanicos;
    private Ingeniero ingenieroPrincipal;
    private List<SponsorContrato> sponsors;


    public Equipo(String nombre, Ingeniero ingenieroPrincipal) {
        this.nombre = nombre;
        this.pilotos = new ArrayList<>();
        this.mecanicos = new ArrayList<>();
        this.ingenieroPrincipal = ingenieroPrincipal;
        this.sponsors = new ArrayList<>();
    }

    public void agregarPiloto(Piloto piloto) {
        pilotos.add(piloto);
    }

    public void agregarMecanico(Mecanico mecanico) {
        mecanicos.add(mecanico);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Piloto> getPilotos() {
        return pilotos;
    }

    public List<Mecanico> getMecanicos() {
        return mecanicos;
    }

    public Ingeniero getIngenieroPrincipal() {
        return ingenieroPrincipal;
    }

    public void setIngenieroPrincipal(Ingeniero ingenieroPrincipal) {
        this.ingenieroPrincipal = ingenieroPrincipal;
    } 

    public List<SponsorContrato> getSponsors() {
        return sponsors;
    }
    

}
