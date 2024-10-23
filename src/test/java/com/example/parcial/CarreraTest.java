package com.example.parcial;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.*;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CarreraTest {
    @Test
    void crear_carrera_test(){
        
        Circuito lemans = new Circuito("24 hs Le Mans", 234, 56);
        LocalDate fechaCarrera = LocalDate.of(2024, 10, 21);
        Carrera francia = new Carrera(fechaCarrera, lemans, new ArrayList<>(), new ArrayList<>());

        assertEquals(fechaCarrera, francia.getFecha());
        assertEquals("24 hs Le Mans", francia.getCircuito().getNombre());
        assertEquals(234, francia.getCircuito().getLongitud());
        assertEquals(56, francia.getCircuito().getVueltasCantidad());

    }

    @Test
    void crear_carrera_y_saber_quienes_participaron_test(){
        Piloto piloto = new Piloto("Franco Colapinto", "Argentina");
        Piloto piloto2 = new Piloto("Franco Colapinto", "Argentina");
        Piloto piloto3 = new Piloto("Franco Colapinto", "Argentina");


        Circuito circuito = new Circuito("Austin", 1234, 56);
        LocalDate fechaCarrera = LocalDate.of(2024, 10, 21 );
        Carrera c1 = new Carrera(fechaCarrera, circuito, new ArrayList<>(), new ArrayList<>());

        c1.getParticipantes().add(piloto);
        c1.getParticipantes().add(piloto2);
        c1.getParticipantes().add(piloto3);

        
        assert(c1 != null);
        assertEquals(3, c1.getParticipantes().size());
        assertEquals("Franco Colapinto", c1.getParticipantes().get(0).getNombre());
    }


    @Test
    void registrar_vuelta_del_piloto_en_circuito() {
        Circuito circuito = new Circuito("Austin", 1234, 56);
        LocalDate fechaCarrera = LocalDate.of(2024, 10, 21 );
        Carrera c1 = new Carrera(fechaCarrera, circuito, new ArrayList<>(), new ArrayList<>());

        Piloto piloto = new Piloto("Franco Colapinto", "Argentina");
        Ingeniero ingeniero = new Ingeniero("Juan Perez", "Argentina");
        Equipo equipo = new Equipo("Williams", ingeniero);

        Vuelta vuelta1 = new Vuelta(piloto, equipo, circuito, 1, 90.5); 
        Vuelta vuelta2 = new Vuelta(piloto, equipo, circuito, 2, 88.1); 
        Vuelta vuelta3 = new Vuelta(piloto, equipo, circuito, 3, 91.3); 

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

    @Test
    void crear_circuito_y_agregar_sponsors_test(){

        Circuito circuito = new Circuito("Austin", 1234, 56);
        LocalDate fechaCarrera = LocalDate.of(2024, 10, 21 );
        Carrera c1 = new Carrera(fechaCarrera, circuito, new ArrayList<>(), new ArrayList<>());

        Sponsor sponsor = new Sponsor("Mercado Libre");
        SponsorContrato contrato = new SponsorContrato(sponsor, "Argentina", LocalDate.of(2024, 10, 21), LocalDate.of(2025, 11, 21));

        circuito.agregar(contrato);

        assert(c1 != null);
        assertEquals(1, circuito.getSponsors().size());
        assertEquals("Mercado Libre", circuito.getSponsors().get(0).getSponsor().getNombre());
    }

    @Test
    void crear_circuito_y_agregar_sponsors_por_ubicacion_test(){

        Circuito circuito = new Circuito("Austin", 1234, 56);
        LocalDate fechaCarrera = LocalDate.of(2024, 10, 21 );
        Carrera c1 = new Carrera(fechaCarrera, circuito, new ArrayList<>(), new ArrayList<>());

        Sponsor sponsor = new Sponsor("Mercado Libre");

        circuito.agregar(sponsor, "Argentina", LocalDate.of(2024, 10, 21));

        assert(c1 != null);
        assertEquals(1, circuito.getSponsors().size()); 
    }

    @Test
    void crear_circuito_y_agregar_sponsor_y_removerlos_test(){

        Circuito circuito = new Circuito("Austin", 1234, 56);
        LocalDate fechaCarrera = LocalDate.of(2024, 10, 21 );
        Carrera c1 = new Carrera(fechaCarrera, circuito, new ArrayList<>(), new ArrayList<>());

        Sponsor sponsor = new Sponsor("Mercado Libre");
        SponsorContrato contrato = new SponsorContrato(sponsor, "Argentina", LocalDate.of(2024, 10, 21), LocalDate.of(2025, 11, 21));

        circuito.agregar(contrato);

        assert(c1 != null);
        assertEquals(1, circuito.getSponsors().size());

        circuito.remover(sponsor);
        assertEquals(0, circuito.getSponsors().size());
    }

    
}

