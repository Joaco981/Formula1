package com.example.parcial;

public class Vuelta {

    private Piloto piloto;
    private Equipo equipo;
    private Circuito circuito;
    private Double duracionVuelta;

    public Vuelta(Piloto piloto, Equipo equipo, Circuito circuito, Double duracionVuelta){
        setCircuito(circuito);
        setDuracionVuelta(duracionVuelta);
        setEquipo(equipo);
        setPiloto(piloto);
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

    public Double getDuracionVuelta() {
        return duracionVuelta;
    }

    public void setDuracionVuelta(Double duracionVuelta) {
        this.duracionVuelta = duracionVuelta;
    }
    
}