package com.example.parcial;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Carrera {
    private Date fecha;
    private Circuito circuito;
    private List<Piloto> participantes;
    
    
    public Carrera(Date fecha, Circuito circuito) {
        this.fecha = fecha;
        this.circuito = circuito;
        this.participantes = new ArrayList<>();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
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
