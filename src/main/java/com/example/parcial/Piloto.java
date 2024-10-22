package com.example.parcial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.parcial.interfaces.ISponsoreable;

public class Piloto 
            extends Persona 
            implements ISponsoreable{

    private List<SponsorContrato> sponsors = new ArrayList<>();
    private List<SponsorContrato> sponsorsHabilitados = new ArrayList<>();

    public Piloto(String nombre, String nacionalidad) {
        super(nombre, nacionalidad);
    }


////////////////////////////////////////////////////////////////
    @Override
    public List<SponsorContrato> getSponsorContrato() {
        return sponsors;
    }

    @Override
    public void agregar(SponsorContrato sponsorContrato) {
        sponsors.add(sponsorContrato);
    }

    @Override
    public void agregar(Sponsor sponsor, String ubicacion, LocalDate fechaDesde, LocalDate fechaHasta) {
        sponsors.add(new SponsorContrato(sponsor, ubicacion, fechaDesde, fechaHasta));
    }

    @Override
    public void remover(Sponsor sponsor, String ubicacion, LocalDate fechaDesde, LocalDate fechaHasta) {
        sponsors.remove(new SponsorContrato(sponsor, ubicacion, fechaDesde, fechaHasta));
    }

    //@Override
    //public void remover(Sponsor sponsor) {
    //    sponsors.remove(sponsor);
    //}

    @Override
    public void remover(String nombreSponsor) {
        
    }

    @Override
    public int getSponsorHabilitados() {
        for (SponsorContrato sponsorContrato : sponsors) {
            if (sponsorContrato.getFechaHasta() != null) {
                sponsorsHabilitados.add(sponsorContrato);
            }
        }

        return sponsorsHabilitados.size();
    }  

}

