package com.example.parcial;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.List;

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

        assertEquals(sponsor1, e1.getSponsors().get(0).getSponsor());
        assertEquals(sponsor2, e1.getSponsors().get(1).getSponsor());
    }


    @Test
    void crear_equipo_y_agregar_sponsors_por_ubicacion_y_fecha_test(){

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

        e1.agregar(sponsor1, "Corrientes", LocalDate.of(2022, 1, 1));
        e1.agregar(sponsor2, "Resistencia", LocalDate.of(2022, 12, 31));

        assertEquals(2, e1.getSponsors().size());
    }

    @Test
    void crear_equipo_y_asignarle_sponsors_y_luego_eliminarlos_test(){

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

        e1.remover(sponsor1);
        assertEquals(1, e1.getSponsors().size());
    }

    @Test
    void saber_cuantos_sponsors_habilitados_test() {
        // Crear el equipo y agregar sponsors
        Ingeniero ingeniero = new Ingeniero("Ramiro", "Argentina");
        Equipo williams = new Equipo("Team", ingeniero);

        Sponsor sponsor1 = new Sponsor("Pepsi");
        Sponsor sponsor2 = new Sponsor("Coca Cola");

        SponsorContrato contrato1 = new SponsorContrato(sponsor1, "Argentina", LocalDate.of(2021, 1, 1), LocalDate.of(2023, 12, 31)); // Habilitado
        SponsorContrato contrato2 = new SponsorContrato(sponsor2, "USA", LocalDate.of(2021, 1, 1), null); // No habilitado

        williams.agregar(contrato1);
        williams.agregar(contrato2);

        List<SponsorContrato> sponsorsHabilitados = williams.getSponsorHabilitados();

        assertEquals(1, sponsorsHabilitados.size());
        assertEquals(sponsor1, sponsorsHabilitados.get(0).getSponsor());
    }
    
    @Test
    void remover_sponsor_por_sponsor_test() {
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

        Sponsor sponsor1 = new Sponsor("Arcor");        

        e1.agregar(new SponsorContrato(sponsor1, "Corrientes", LocalDate.of(2022, 1, 1), LocalDate.of(2022, 12, 31)));
        e1.agregar(new SponsorContrato(sponsor1, "Resistencia", LocalDate.of(2022, 1, 1), LocalDate.of(2022, 12, 31)));

        e1.remover(sponsor1);
        assertEquals(0, e1.getSponsors().size());
    }

    @Test
    void remover_sponsor_por_ubicacion_test() {
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

        Sponsor sponsor1 = new Sponsor("Arcor");

        e1.agregar(new SponsorContrato(sponsor1, "Corrientes", LocalDate.of(2022, 1, 1), LocalDate.of(2022, 12, 31)));
        e1.agregar(new SponsorContrato(sponsor1, "Resistencia", LocalDate.of(2022, 1, 1), LocalDate.of(2022, 12, 31)));

        e1.remover(sponsor1, "Corrientes");
        assertEquals(1, e1.getSponsors().size());
    }

    @Test
    void remover_sponsor_por_string_test() {
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

        Sponsor sponsor1 = new Sponsor("Arcor");

        e1.agregar(new SponsorContrato(sponsor1, "Corrientes", LocalDate.of(2022, 1, 1), LocalDate.of(2022, 12, 31)));
        e1.agregar(new SponsorContrato(sponsor1, "Resistencia", LocalDate.of(2022, 1, 1), LocalDate.of(2022, 12, 31)));

        e1.remover("Arcor");
        assertEquals(0, e1.getSponsors().size());
    }
    
}    
