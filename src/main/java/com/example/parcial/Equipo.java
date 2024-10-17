package com.example.parcial;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Piloto> pilotos;
    private List<Mecanico> mecanicos;
    private Ingeniero ingenieroPrincipal;


    public Equipo(String nombre) {
        this.nombre = nombre;
        this.pilotos = new ArrayList<>();
    }

    public void agregarPiloto(Piloto piloto) {
        pilotos.add(piloto);
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


}
