package com.example.parcial;

import java.util.List;

public class Carrera {
    private String fecha;
    private Circuito circuito;
    private List<Piloto> participantes;
    
    
    public Carrera(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
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

}
