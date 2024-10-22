package com.example.parcial.interfaces;

import java.time.LocalDate;
import java.util.List;

import com.example.parcial.Sponsor;
import com.example.parcial.SponsorContrato;

public interface ISponsoreable {
    
    List<SponsorContrato> getSponsors();
    void agregarSponsor(Sponsor sponsor);
    void removerSponsor(Sponsor sponsor);
    void agregarSC(SponsorContrato sc);
    void removerSC(SponsorContrato sc);
    List<SponsorContrato> sponsorsHabilitados();
}
