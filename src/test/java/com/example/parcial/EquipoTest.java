package com.example.parcial;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EquipoTest {
    @Test
    void crear_equipo_test(){
        
        Piloto p1 = new Piloto("Juan", "Argentina");
        Piloto p2 = new Piloto("Ivan", "India");
        Mecanico m1 = new Mecanico("Joaco", "Argentina");
        Mecanico m2 = new Mecanico("Camello", "Argentina");
        Ingeniero inge = new Ingeniero("Ramiro", "Argentina");
        Equipo e1 = new Equipo("esencia", inge);

        e1.agregarPiloto(p1);
        e1.agregarPiloto(p2);
        e1.agregarMecanico(m1);
        e1.agregarMecanico(m2);
        
        assertEquals("esencia", e1.getNombre());
        assertEquals(2, e1.getPilotos().size());
        assertEquals(2, e1.getMecanicos().size());
        assertEquals(inge, e1.getIngenieroPrincipal());

    }

    @Test
    void crear_ingeniero_y_agregar_a_equipo_test(){

        Ingeniero inge = new Ingeniero("Ramiro", "Argentina");
        Equipo e1 = new Equipo("esencia", inge);

        assertEquals("esencia", e1.getNombre());
        assertEquals(inge, e1.getIngenieroPrincipal());
    }

    @Test
    void crear_mecanico_y_agregar_a_equipo_test(){
        Mecanico m1 = new Mecanico("Joaco", "Argentina");
        Ingeniero inge = new Ingeniero("Ramiro", "Argentina");
        Equipo e1 = new Equipo("esencia", inge);

        e1.agregarMecanico(m1);

        assertEquals("esencia", e1.getNombre());
        assertEquals(m1, e1.getMecanicos().get(0));
    }


    @Test
    void crear_equipo_y_asignarle_sponsors_test(){

        Piloto p1 = new Piloto("Juan", "Argentina");
        Piloto p2 = new Piloto("Ivan", "India");
        Mecanico m1 = new Mecanico("Joaco", "Argentina");
        Mecanico m2 = new Mecanico("Camello", "Argentina");
        Ingeniero inge = new Ingeniero("Ramiro", "Argentina");
        Equipo e1 = new Equipo("esencia", inge);

        e1.agregarPiloto(p1);
        e1.agregarPiloto(p2);
        e1.agregarMecanico(m1);
        e1.agregarMecanico(m2);

        Sponsor sponsor1 = new Sponsor("Sponsor 1");
        Sponsor sponsor2 = new Sponsor("Sponsor 2");

        e1.agregar(new SponsorContrato(sponsor1, "Corrientes", LocalDate.of(2022, 1, 1), LocalDate.of(2022, 12, 31)));
        e1.agregar(new SponsorContrato(sponsor2, "Resistencia", LocalDate.of(2022, 1, 1), LocalDate.of(2022, 12, 31)));

        assertEquals(2, e1.getSponsors().size());
    }
}    
