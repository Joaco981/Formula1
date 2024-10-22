package com.example.parcial;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FiltroTest {
    @Test
    void filtrar_pilotos_por_nacionalidad_test() {
        Piloto p1 = new Piloto("Juan", "Argentina");
        Piloto p2 = new Piloto("Pedro", "Chile");
        Piloto p3 = new Piloto("Maria", "Chile");
        Piloto p4 = new Piloto("Luis", "Chile");
        ArrayList<Piloto> pilotos = new ArrayList<>();
        Filtro f1 = new Filtro();
        
        pilotos.add(p1);
        pilotos.add(p2);
        pilotos.add(p3);
        pilotos.add(p4);

        List<Piloto> pilotosFiltrados = f1.filtrarPorNacionalidad(pilotos, "Chile");

        assertEquals(3, pilotosFiltrados.size());
    }
    
    @Test
    void filtrar_cant_de_vueltas_por_circuito_test() {
        Circuito estadosUnidos = new Circuito("Austin", 1234, 56);
        Circuito singapur = new Circuito("Baku", 1234, 56);
        
        Carrera carrera = new Carrera(LocalDate.of(2024, 10, 21 ), estadosUnidos, new ArrayList<>());
        Carrera carrera2 = new Carrera(LocalDate.of(2024, 10, 21 ), singapur, new ArrayList<>());
        
        Piloto piloto = new Piloto("Franco Colapinto", "Argentina");
        Ingeniero ingeniero = new Ingeniero("Juan Perez", "Argentina");
        Equipo equipo = new Equipo("Williams", ingeniero);

        Vuelta vuelta1 = new Vuelta(piloto, equipo, estadosUnidos, 90.5);
        Vuelta vuelta2 = new Vuelta(piloto, equipo, estadosUnidos, 88.1);
        Vuelta vuelta3 = new Vuelta(piloto, equipo, estadosUnidos, 91.3);

        carrera.agregarVuelta(vuelta3);
        carrera.agregarVuelta(vuelta2);
        carrera.agregarVuelta(vuelta1);

        Filtro f1 = new Filtro();

        List<Vuelta> vueltasFiltradas = f1.filtrarPorCircuito(carrera.getVueltas(), estadosUnidos);
        assertEquals(3, vueltasFiltradas.size());

    }


    @Test
    void filtrar_pilotos_por_equipo_test() {
        Piloto p1 = new Piloto("Juan", "Argentina");
        Piloto p2 = new Piloto("Pedro", "Chile");
        Piloto p3 = new Piloto("Maria", "Chile");
        Piloto p4 = new Piloto("Luis", "Chile");
        Ingeniero ingeniero = new Ingeniero("Juan Perez", "Argentina");
        Equipo williams = new Equipo("Williams", ingeniero);
        
        williams.agregarPiloto(p1);
        williams.agregarPiloto(p2);

        Filtro f1 = new Filtro();
    
        List<Piloto> pilotosFiltrados = f1.filtrarPorEquipo(williams.getPilotos(), williams);

        assertEquals(2, pilotosFiltrados.size());
    }
}    
