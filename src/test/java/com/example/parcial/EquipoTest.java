package com.example.parcial;
import static org.junit.jupiter.api.Assertions.assertEquals;


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
}
