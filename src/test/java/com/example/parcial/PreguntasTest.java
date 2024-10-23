package com.example.parcial;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.parcial.interfaces.INombreParaLED;

@SpringBootTest
public class PreguntasTest {
    
    @Test
    void pantalla_led_piloto() {
        INombreParaLED piloto = new Piloto("Franco Colapinto", "Argentina");
        var pantallaLED = new PantallaLED(piloto);
        assertEquals("Piloto: Franco Colapinto", pantallaLED.getTexto());
    }

    @Test
    void pantalla_led_mecanico() {
        INombreParaLED mecanico = new Mecanico("Mecanico 1", "Argentina");
        var pantallaLED = new PantallaLED(mecanico);
        assertEquals("Mecanico: Mecanico 1", pantallaLED.getTexto());
    }

    @Test
    void pantalla_led_sponsor() {
        INombreParaLED sponsor = new Sponsor("Bizarrap");
        var pantallaLED = new PantallaLED(sponsor);
        assertEquals("Sponsor: Bizarrap", pantallaLED.getTexto());
    }

    //ESTE TEST ME FALTO
    //@Test
    //void pantalla_led_circuito() {
    //    INombreParaLED circuito = new Circuito("Austin", 1234, 56);
    //    Sponsor sponsor = new Sponsor("Bizarrap");
    //    var pantallaLED = new PantallaLED(sponsor);
    //    assertEquals("Circuito: Austin (L{ongitud XXX mts.)", pantallaLED.getTexto());
    //}

    @Test
    void crear_circuito_en_UCP_test() {
        Circuito circuito = new Circuito("Austin", 1234, 56);
        Carrera carrera = new Carrera(LocalDate.of(2024, 10, 21 ), circuito, new ArrayList<>(), new ArrayList<>());
        Ingeniero inge = new Ingeniero("Ramiro", "Argentina");


        for(int i = 1; i <= 10; i++) {
            Piloto piloto = new Piloto("Piloto " + i, "Argentina");
            Equipo equipo = new Equipo("Equipo " + i, inge);
            carrera.getParticipantes().add(piloto);
            for (int j = 1; j <= 56; j++) {
                double tiempo = i * j * 1000;
		        int numeroVuelta = j;
                Vuelta vuelta = new Vuelta(piloto, equipo, circuito, numeroVuelta, tiempo);
                carrera.agregarVuelta(vuelta);
            }
        }

        Vuelta vueltaMasRapida = null;

        for (Vuelta vuelta : carrera.getVueltas()) {
            if (vueltaMasRapida == null || vuelta.getDuracionVuelta() < vueltaMasRapida.getDuracionVuelta()) {
                vueltaMasRapida = vuelta;
            }
        }

        Piloto pilotoMasRapido = vueltaMasRapida.getPiloto();

        assertEquals(1, vueltaMasRapida.getNumeroVuelta());
        assertEquals(pilotoMasRapido.getNombre(), vueltaMasRapida.getPiloto().getNombre());


    }

}
