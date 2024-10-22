package com.example.parcial;

import java.util.ArrayList;
import java.util.List;

import com.example.parcial.interfaces.ISponsoreable;

public class Piloto 
            extends Persona 
            implements ISponsoreable{

    private List<SponsorContrato> sponsors;
    private List<SponsorContrato> sponsorsHabilitados;

    public Piloto(String nombre, String nacionalidad) {
        super(nombre, nacionalidad);
    }

////////////////////////////////////////////////////////////////    
    @Override
    public void agregar(SponsorContrato sc) {
        
    }

    @Override
    public void agregarSC() {
        
    }

    @Override
    public void removerSponsor() {
        
    }

    @Override
    public void remover() {
        
    }

    @Override
    public void removerSC(SponsorContrato sc) {
        
    }

    @Override
    public int sponsorHabilitados(){

        for (SponsorContrato sponsorContrato : sponsors) {
            if (sponsorContrato.getFechaHasta() != null) {
                sponsorsHabilitados.add(sponsorContrato);
            }
        }

        return sponsorsHabilitados.size();

    }
    
}

