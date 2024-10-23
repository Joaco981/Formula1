package com.example.parcial;

import com.example.parcial.interfaces.INombreParaLED;

public class PantallaLED {
    private INombreParaLED texto;

    public PantallaLED(INombreParaLED texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto.getNombreParaLED();
    }
}
