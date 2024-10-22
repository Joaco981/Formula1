package com.example.parcial;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filtro {
    
    private String descripcion;
    private Predicate<Piloto> predicado;
    
    //descripcion del filtro y predicado que se aplica a cada email, para filtros complejos
    public Filtro(String descripcion, Predicate<Piloto> predicado) {
        this.descripcion = descripcion;
        this.predicado = predicado;
    }

    public Predicate<Piloto> getPredicado() {
        return predicado;
    }

    public String getDescripcion() {
        return descripcion;
    }


    public List<Piloto> filtrarPorNacionalidad (ArrayList<Piloto> pilotos, String nacionalidad) {
        return pilotos.stream()
                      .filter(piloto -> piloto.getNacionalidad().equals(nacionalidad))
                      .collect(Collectors.toList());
    }

    public List<Vuelta> filtrarPorVuelta (ArrayList<Vuelta> vueltas, Circuito circuito) {
        return vueltas.stream()
                      .filter(v -> v.getCircuito().equals(circuito))
                      .collect(Collectors.toList());
    }

    public ArrayList<Piloto> filtrar(ArrayList<Piloto> pilotos) {
        return (ArrayList<Piloto>) pilotos.stream()
                                          .filter(predicado)
                                          .collect(Collectors.toList());
    }
}
