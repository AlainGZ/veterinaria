/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gomez
 */
public class HistotialClinico {
    
    private final Long id;
    private Mascota mascota;
    private final List<DetalleClinico>detalles;

    public HistotialClinico(Long id) {
        this.id = id;
        detalles = new ArrayList<>();
    }
    
    public void agregarDetalle(DetalleClinico detalleClinico){
        detalles.add(detalleClinico);
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
}
