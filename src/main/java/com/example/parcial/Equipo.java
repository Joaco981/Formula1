package com.example.parcial;

import com.example.parcial.interfaces.ISponsoreable;
import java.util.ArrayList;
import java.util.List;

public class Equipo 
            implements ISponsoreable{

    private String nombre;
    private List<Piloto> pilotos;
    private List<Mecanico> mecanicos;
    private Ingeniero ingenieroPrincipal;
    private List<SponsorContrato> sponsors;


    public Equipo(String nombre, Ingeniero ingenieroPrincipal) {
        setNombre(nombre);
        setIngenieroPrincipal(ingenieroPrincipal);
        setPilotos(pilotos);
        setMecanicos(mecanicos);
        setSponsors(sponsors);
    }

    public void agregarPiloto(Piloto piloto) {
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

    public void agregarSponsor(SponsorContrato sponsor) {
        sponsors.add(sponsor);
    }

////////////////////////////////////////////////////////////////
    @Override
    public void agregar(SponsorContrato sc) {
        
    }

    @Override
    public void agregarSC() {
        
    }

    @Override
    public void removerSponsor() {
        
    }

    @Override
    public void remover() {
        
    }

    @Override
    public void removerSC() {
        
    }

    @Override
    public void sponsorsHabilitados() {
        
    }
    

}
