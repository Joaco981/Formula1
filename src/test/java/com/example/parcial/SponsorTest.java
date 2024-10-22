package com.example.parcial;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SponsorTest {
    @Test
    void crear_un_sponsor_test(){
        Sponsor s1 = new Sponsor("Coca Cola");
        assertEquals("Coca Cola", s1.getNombre());
    }

    @Test 
    void crear_un_sponsor_contrato_test(){
        Sponsor s1 = new Sponsor("Coca Cola");
        LocalDate fechaDesde = LocalDate.of(2024, 10, 21);
        LocalDate fechaHasta = LocalDate.of(2026, 10, 21);

        SponsorContrato sc1 = new SponsorContrato(s1, "Argentina", fechaDesde, fechaHasta);
        assertEquals("Coca Cola", sc1.getSponsor().getNombre());    
        assertEquals("Argentina", sc1.getUbicacion());
        assertEquals(fechaDesde, sc1.getFechaDesde());
        assertEquals(fechaHasta, sc1.getFechaHasta());
    }
}
