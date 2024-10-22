package com.example.parcial;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filtro {

    public List<Piloto> filtrarPorNacionalidad (ArrayList<Piloto> pilotos, String nacionalidad) {
        return pilotos.stream()
                      .filter(piloto -> piloto.getNacionalidad().equals(nacionalidad))
                      .collect(Collectors.toList());
    }

    public List<Vuelta> filtrarPorCircuito (List<Vuelta> vueltas, Circuito circuito) {
        return vueltas.stream()
                      .filter(vuelta -> vuelta.getCircuito().equals(circuito))
                      .collect(Collectors.toList());
    }

    public List<Piloto> filtrarPorEquipo (List<Piloto> pilotos, Equipo equipo) {
        return pilotos.stream()
                      .filter(piloto -> piloto.getEquipo().equals(equipo))
                      .collect(Collectors.toList());
    }

    public List<Vuelta> filtrarPorTiempo (List<Vuelta> vueltas, double tiempoEspecifico) {
        return vueltas.stream()
                      .filter(vuelta -> vuelta.getDuracionVuelta() > tiempoEspecifico)
                      .collect(Collectors.toList());
    }
    
    public List<Circuito> filtrarPorLongitud (List<Circuito> circuitos, int longitud) {
        return circuitos.stream()
                        .filter(circuito -> circuito.getLongitud() > longitud)
                        .collect(Collectors.toList());
    }

}
