package com.example.parcial;

import com.example.parcial.interfaces.ISponsoreable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Equipo 
            implements ISponsoreable{

    private String nombre;
    private List<Piloto> pilotos;
    private List<Mecanico> mecanicos;
    private Ingeniero ingenieroPrincipal;
    private List<SponsorContrato> sponsors;
    private List<SponsorContrato> sponsorsHabilitados;


    public Equipo(String nombre, Ingeniero ingenieroPrincipal) {
        setNombre(nombre);
        setIngenieroPrincipal(ingenieroPrincipal);
        setPilotos(new ArrayList<>());
        setMecanicos(new ArrayList<>());
        setSponsors(new ArrayList<>());
    }

    public void agregarPiloto(Piloto piloto) {
        piloto.setEquipo(this);
        pilotos.add(piloto);
    }

    public void agregarMecanico(Mecanico mecanico) {
        mecanicos.add(mecanico);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Piloto> getPilotos() {
        return pilotos;
    }

    public void setPilotos(List<Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    public List<Mecanico> getMecanicos() {
        return mecanicos;
    }

    public void setMecanicos(List<Mecanico> mecanicos) {
        this.mecanicos = mecanicos;
    }

    public Ingeniero getIngenieroPrincipal() {
        return ingenieroPrincipal;
    }

    public void setIngenieroPrincipal(Ingeniero ingenieroPrincipal) {
        this.ingenieroPrincipal = ingenieroPrincipal;
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
        var sc1 = new SponsorContrato(sponsor, ubicacion, fechaDesde, fechaHasta);
        this.agregar(sc1);
    }

    @Override
    public void remover(Sponsor sponsor, String ubicacion, LocalDate fechaDesde, LocalDate fechaHasta) {
        sponsors.remove(new SponsorContrato(sponsor, ubicacion, fechaDesde, fechaHasta));
    }

    @Override
    public void remover(Sponsor sponsor) {
        sponsors.removeIf(sponsorContrato -> sponsorContrato.getSponsor().equals(sponsor));
    }

    @Override
    public void remover(String nombreSponsor) {
        sponsors.removeIf(sponsorContrato -> sponsorContrato.getSponsor().getNombre().equals(nombreSponsor));
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
