package com.example.parcial.interfaces;

import java.time.LocalDate;
import java.util.List;

import com.example.parcial.Sponsor;
import com.example.parcial.SponsorContrato;

public interface ISponsoreable {
    
    List<SponsorContrato> getSponsorContrato(); 
    void agregar(SponsorContrato sponsorContrato);
    void agregar(Sponsor sponsor, String ubicacion, LocalDate fechaDesde, LocalDate fechaHasta);
    void remover(Sponsor contrato,String ubicacion, LocalDate fechaDesde, LocalDate fechaHasta);
    void remover(Sponsor sponsor);
    void remover(String nombreSponsor);
    List<SponsorContrato> getSponsorHabilitados(); 
    
}
