package com.example.parcial;

import java.util.ArrayList;
import java.time.*;
import java.util.List;

public class Carrera {
    private LocalDate fecha;
    private Circuito circuito;
    private List<Piloto> participantes;
    private List<Vuelta> vueltas;
    
    
    public Carrera(LocalDate fecha, Circuito circuito, List<Vuelta> vueltas) {
        this.fecha = fecha;
        this.circuito = circuito;
        this.vueltas = new ArrayList<>();
        this.participantes = new ArrayList<>();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    public Circuito getCircuito() {
        return circuito;
    }

    public void setCircuito(Circuito circuito) {
        this.circuito = circuito;
    }

    public List<Piloto> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Piloto> participantes) {
        this.participantes = participantes;
    }

    public List<Vuelta> getVueltas() {
        return vueltas;
    }

    public void setVueltas(List<Vuelta> vueltas) {
        this.vueltas = vueltas;
    }
    
    public void agregarVuelta(Vuelta vuelta) {
        vueltas.add(vuelta);
    }
}
