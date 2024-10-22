package com.example.parcial;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CircuitoTest {
    @Test
    void crear_carrera_test(){
        Date fecha = dateFormat.parse("29/09/2020" );
        Circuito lemans = new Circuito("24 hs Le Mans", "3 cuadras", 56);
        
        Carrera francia = new Carrera(fecha, lemans);

    }
}
