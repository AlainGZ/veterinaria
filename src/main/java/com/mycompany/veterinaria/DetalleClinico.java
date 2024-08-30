/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria;

import java.time.LocalDateTime;

/**
 *
 * @author gomez
 */
public class DetalleClinico {
    
    private LocalDateTime fecha;
    private String descripcion;
    private HistotialClinico historialClinico;
    
    public DetalleClinico(Consulta consulta){
        //To do implementar constructor 
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public HistotialClinico getHistorialClinico() {
        return historialClinico;
    }

    public void setHistorialClinico(HistotialClinico historialClinico) {
        this.historialClinico = historialClinico;
    }
    
    
}
