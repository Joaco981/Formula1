package com.example.parcial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.parcial.interfaces.ISponsoreable;

public class Circuito 
    implements ISponsoreable{

    private String nombre;
    private int longitud;
    private int vueltasCantidad;
    private List<SponsorContrato> sponsors;
    private List<SponsorContrato> sponsorsHabilitados;


    public Circuito(String nombre, int longitud, int vueltasCantidad) {
        setNombre(nombre);
        setLongitud(longitud);
        setVueltasCantidad(vueltasCantidad);
        setSponsors(new ArrayList<>());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getVueltasCantidad() {
        return vueltasCantidad;
    }

    public void setVueltasCantidad(int vueltasCantidad) {
        this.vueltasCantidad = vueltasCantidad;
    }

    public List<SponsorContrato> getSponsors() {
        return sponsors;
    }

    public void setSponsors(List<SponsorContrato> sponsors) {
        this.sponsors = sponsors;
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
