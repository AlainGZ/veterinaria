
package com.mycompany.veterinaria;

import java.time.LocalDate;


public class Factura {
    
    private final Long numero;
    private LocalDate fecha;

    public Factura(Long numero, LocalDate fecha) {
        this.numero = numero;
        this.fecha = fecha;
    }

    public void agregarDetalleFactura(DetalleFactura detalleFactura){
        //todo 
    }
    public Double getTotal(){
        //To Do implementarmetdo
        return 0d;
    }
    
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Long getNumero() {
        return numero;
    }
    
    
    
}
