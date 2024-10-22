package com.example.parcial;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


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
    void crear_un_sponsor_contrato_test() throws ParseException{
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        Date fechaDesde = dateFormat.parse("29/09/2020");
        Date fechaHasta = dateFormat.parse("29/09/2022");
        
        Sponsor s1 = new Sponsor("Coca Cola");
        SponsorContrato sc1 = new SponsorContrato(s1, "Argentina", fechaDesde, fechaHasta);
        assertEquals("Coca Cola", sc1.getSponsor().getNombre());    
        assertEquals("Argentina", sc1.getUbicacion());
        assertEquals(fechaDesde, sc1.getFechaDesde());
        assertEquals(fechaHasta, sc1.getFechaHasta());
    }
}
