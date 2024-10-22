package com.example.parcial;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
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


        Predicate<Piloto> predicado = e -> e.getNacionalidad().contains("Chile");
        Filtro f1 = new Filtro("Pilotos que sean chilenos", predicado);
        
        
        pilotos.add(p1);
        pilotos.add(p2);
        pilotos.add(p3);
        pilotos.add(p4);


        assertEquals(3, f1.filtrar(pilotos).size());
    }        
        
}
