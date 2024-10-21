package com.example.parcial.interfaces;

import java.util.List;

import com.example.parcial.SponsorContrato;

public interface ISponsoreable {
    
    List<SponsorContrato> getSponsors();
    void agregar(SponsorContrato);
    void agregar(Sponsor, ubicacion, fechaDesde);
    void remover(Sponsor);
    void remover(string);
    void remover(Sponsor, ubicacion);
    void sponsorsHabilitados();
}
