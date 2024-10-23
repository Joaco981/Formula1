package com.example.parcial;

public class Vuelta {

    private Piloto piloto;
    private Equipo equipo;
    private Circuito circuito;
    private int numeroVuelta;
    private Double duracionVuelta;

    public Vuelta(Piloto piloto, Equipo equipo, Circuito circuito, int numeroVuelta, Double duracionVuelta){
        setPiloto(piloto);
        setEquipo(equipo);
        setCircuito(circuito);
        setNumeroVuelta(numeroVuelta);
        setDuracionVuelta(duracionVuelta);
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Circuito getCircuito() {
        return circuito;
    }

    public void setCircuito(Circuito circuito) {
        this.circuito = circuito;
    }

    public int getNumeroVuelta() {
        return numeroVuelta;
    }

    public void setNumeroVuelta(int numeroVuelta) {
        this.numeroVuelta = numeroVuelta;
    }

    public Double getDuracionVuelta() {
        return duracionVuelta;
    }

    public void setDuracionVuelta(Double duracionVuelta) {
        this.duracionVuelta = duracionVuelta;
    }
    
}