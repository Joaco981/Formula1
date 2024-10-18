package com.example.parcial;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CircuitoTest {
    @Test
    void crear_circuito_test(){
        Piloto piloto = new Piloto("Juan", "Argentina");
        Mecanico mecanico = new Mecanico("Joaco", "Argentina");
        Ingeniero ingeniero = new Ingeniero("Ramiro", "Argentina");

        




    }
}
