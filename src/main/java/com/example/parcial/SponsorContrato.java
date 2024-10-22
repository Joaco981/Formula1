package com.example.parcial;

import java.util.Date;

public class SponsorContrato {
    private String ubicacion;
    private Date fechaDesde;
    private Date fechaHasta;
    private Sponsor sponsor;

    public SponsorContrato(Sponsor sponsor, String ubicacion, Date fechaDesde, Date fechaHasta) {
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
    
    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }
    

}
