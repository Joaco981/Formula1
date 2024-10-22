package com.example.parcial;

import java.time.*;

public class SponsorContrato {
    private String ubicacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private Sponsor sponsor;

    public SponsorContrato(Sponsor sponsor, String ubicacion, LocalDate fechaDesde, LocalDate fechaHasta) {
        this.sponsor = sponsor;
        this.ubicacion = ubicacion;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public void setFechaDesde(LocalDate fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public LocalDate getFechaDesde() {
        return fechaDesde;
    }

    public LocalDate getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(LocalDate fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }
    

}
