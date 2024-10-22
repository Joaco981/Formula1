package com.example.parcial;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CircuitoTest {
    @Test
    void crear_carrera_test(){
        
        Circuito lemans = new Circuito("24 hs Le Mans", 234, 56);
        LocalDate fechaCarrera = LocalDate.of(2024, 10, 21);
        Carrera francia = new Carrera(fechaCarrera, lemans, new ArrayList<>());

        assertEquals(fechaCarrera, francia.getFecha());
        assertEquals("24 hs Le Mans", francia.getCircuito().getNombre());
        assertEquals(234, francia.getCircuito().getLongitud());
        assertEquals(56, francia.getCircuito().getVueltasCantidad());

    }


    @Test
    void registrar_vuelta_del_piloto_en_circuito() {
        Circuito circuito = new Circuito("Austin", 1234, 56);
        LocalDate fechaCarrera = LocalDate.of(2024, 10, 21 );
        Carrera c1 = new Carrera(fechaCarrera, circuito, new ArrayList<>());

        Piloto piloto = new Piloto("Franco Colapinto", "Argentina");
        Ingeniero ingeniero = new Ingeniero("Juan Perez", "Argentina");
        Equipo equipo = new Equipo("Williams", ingeniero);

        Vuelta vuelta1 = new Vuelta(piloto, equipo, circuito, 90.5); 
        Vuelta vuelta2 = new Vuelta(piloto, equipo, circuito, 88.1); 
        Vuelta vuelta3 = new Vuelta(piloto, equipo, circuito, 91.3); 

        c1.agregarVuelta(vuelta3);
        c1.agregarVuelta(vuelta2);
        c1.agregarVuelta(vuelta1);

        assert(c1 != null);
        assertEquals(piloto, vuelta1.getPiloto());
        assertEquals(equipo, vuelta1.getEquipo());
        assertEquals(circuito, vuelta1.getCircuito());
        assertEquals(90.5, vuelta1.getDuracionVuelta());

        assertEquals(piloto, vuelta2.getPiloto());
        assertEquals(equipo, vuelta2.getEquipo());
        assertEquals(circuito, vuelta2.getCircuito());
        assertEquals(88.1, vuelta2.getDuracionVuelta());

        assertEquals(piloto, vuelta3.getPiloto());
        assertEquals(equipo, vuelta3.getEquipo());
        assertEquals(circuito, vuelta3.getCircuito());
        assertEquals(91.3, vuelta3.getDuracionVuelta());

        assertEquals(3, c1.getVueltas().size());
    }

    
}

