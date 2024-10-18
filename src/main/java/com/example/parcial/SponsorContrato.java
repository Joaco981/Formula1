package com.example.parcial;

import java.util.Date;

public class SponsorContrato {
    private String ubicacion;
    private Date fechaDesde;
    private Date fechaHasta;


    public SponsorContrato(String ubicacion, Date fechaDesde, Date fechaHasta) {
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

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

}
