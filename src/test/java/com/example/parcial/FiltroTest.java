package com.example.parcial;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    void filtrar_cant_de_vueltas_por_carrera_test() {
        Circuito estadosUnidos = new Circuito("Austin", 1234, 56);
        Circuito singapur = new Circuito("Baku", 1234, 56);
        
        Carrera carrera = new Carrera(LocalDate.of(2024, 10, 21 ), estadosUnidos, new ArrayList<>(), new ArrayList<>());
        Carrera carrera2 = new Carrera(LocalDate.of(2024, 10, 21 ), singapur, new ArrayList<>(), new ArrayList<>());
        
        Piloto piloto = new Piloto("Franco Colapinto", "Argentina");
        Ingeniero ingeniero = new Ingeniero("Juan Perez", "Argentina");
        Equipo equipo = new Equipo("Williams", ingeniero);

        Vuelta vuelta1 = new Vuelta(piloto, equipo, estadosUnidos, 90.5);
        Vuelta vuelta2 = new Vuelta(piloto, equipo, estadosUnidos, 88.1);
        Vuelta vuelta3 = new Vuelta(piloto, equipo, estadosUnidos, 91.3);

        Vuelta vuelta4 = new Vuelta(piloto, equipo, singapur, 90.5);
        Vuelta vuelta5 = new Vuelta(piloto, equipo, singapur, 88.1);
        Vuelta vuelta6 = new Vuelta(piloto, equipo, singapur, 91.3);

        carrera.agregarVuelta(vuelta3);
        carrera.agregarVuelta(vuelta2);
        carrera.agregarVuelta(vuelta1);

        carrera2.agregarVuelta(vuelta6);
        carrera2.agregarVuelta(vuelta5);
        carrera2.agregarVuelta(vuelta4);

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
        assertEquals(p1, pilotosFiltrados.get(0));
        assertEquals(p2, pilotosFiltrados.get(1));

        assertFalse(pilotosFiltrados.contains(p3));
        assertFalse(pilotosFiltrados.contains(p4));
    }

    @Test
    void filtrar_cuantas_vueltas_fueron_mas_rapidas_en_un_tiempo_especifico_test() {
        Piloto piloto = new Piloto("Franco Colapinto", "Argentina");
        Ingeniero ingeniero = new Ingeniero("Juan Perez", "Argentina");
        Equipo equipo = new Equipo("Williams", ingeniero);
        
        Circuito estadosUnidos = new Circuito("Austin", 1234, 56);
        Carrera carrera = new Carrera(LocalDate.of(2024, 10, 21 ), estadosUnidos, new ArrayList<>(), new ArrayList<>());

        Vuelta vuelta1 = new Vuelta(piloto, equipo, estadosUnidos, 90.5);
        Vuelta vuelta2 = new Vuelta(piloto, equipo, estadosUnidos, 88.1);
        Vuelta vuelta3 = new Vuelta(piloto, equipo, estadosUnidos, 91.3);

        carrera.agregarVuelta(vuelta1);
        carrera.agregarVuelta(vuelta2);
        carrera.agregarVuelta(vuelta3);

        Filtro f1 = new Filtro();

        List<Vuelta> vueltasFiltradas = f1.filtrarPorTiempo(carrera.getVueltas(), 90.0);

        assertEquals(2, vueltasFiltradas.size());
    }

    @Test
    void cuantos_circuitos_tienen_una_longitud_mayor_a_un_valor_determinado_test() {

        Circuito singapur = new Circuito("Singapur", 1234, 56);
        Circuito Austin = new Circuito("Austin", 1300, 56);
        Circuito mexico = new Circuito("Mexico", 1302, 56);
        Circuito montreal = new Circuito("Montreal", 1500, 56);
        Circuito estoril = new Circuito("Estoril", 700, 56);

        ArrayList<Circuito> circuitos = new ArrayList<>();
        circuitos.add(singapur);
        circuitos.add(Austin);
        circuitos.add(mexico);
        circuitos.add(montreal);
        circuitos.add(estoril);

        Filtro f1 = new Filtro();
        List<Circuito> circuitosFiltrados = f1.filtrarPorLongitud(circuitos, 1300);

        assertEquals(2, circuitosFiltrados.size());
    }
}    
