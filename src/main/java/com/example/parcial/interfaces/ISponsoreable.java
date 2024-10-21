package com.example.parcial.interfaces;

import java.util.List;

import com.example.parcial.SponsorContrato;

public interface ISponsoreable {
    
    List<SponsorContrato> getSponsors();
    void agregar(SponsorContrato);
    void agregarSC(Sponsor, ubicacion, fechaDesde);
    void removerSponsor(Sponsor);
    void remover(string);
    void removerSC(Sponsor, ubicacion);
    void sponsorsHabilitados();
}
