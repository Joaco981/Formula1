package com.example.parcial;

import java.util.ArrayList;
import java.util.List;

import com.example.parcial.interfaces.ISponsoreable;

public class Piloto extends Persona implements ISponsoreable{
    private List<SponsorContrato> sponsors;

    public Piloto(String nombre, String nacionalidad) {
        super(nombre, nacionalidad);
        this.sponsors = new ArrayList<>();
    }

    public List<SponsorContrato> getSponsors() {
        return sponsors;
    }

    public void setSponsors(List<SponsorContrato> sponsors) {
        this.sponsors = sponsors;
    }
    
}

