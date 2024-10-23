package com.example.parcial.interfaces;

import java.time.LocalDate;
import java.util.List;

import com.example.parcial.Sponsor;
import com.example.parcial.SponsorContrato;

public interface ISponsoreable {
    
    List<SponsorContrato> getSponsors(); 
    void agregar(SponsorContrato sponsorContrato);
    void agregar(Sponsor sponsor, String ubicacion, LocalDate fechaDesde);
    void remover(Sponsor sponsor);
    void remover(Sponsor sponsor, String ubicacion);
    void remover(String nombreSponsor);
    List<SponsorContrato> getSponsorHabilitados(); 
    
}
