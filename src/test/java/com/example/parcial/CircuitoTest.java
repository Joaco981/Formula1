package com.example.parcial;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CircuitoTest {
    @Test
    void crear_carrera_test(){
        
        Circuito lemans = new Circuito("24 hs Le Mans", "3 cuadras", 56);
        LocalDate fechaCarrera = LocalDate.of(2024, 10, 21);
        Carrera francia = new Carrera(fechaCarrera, lemans);

        assertEquals(fechaCarrera, francia.getFecha());
        assertEquals("24 hs Le Mans", francia.getCircuito().getNombre());
        assertEquals("3 cuadras", francia.getCircuito().getLongitud());
        assertEquals(56, francia.getCircuito().getVueltasCantidad());

    }
}
