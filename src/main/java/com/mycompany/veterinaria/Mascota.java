
package com.mycompany.veterinaria;


public class Mascota extends Animal{
    
    private Long id;
    private Cliente cliente;
    private HistotialClinico historialClinico;

    public Mascota( String especie, String raza, String nombre, Long id) {
        super(especie, raza, nombre);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public HistotialClinico getHistotialClinico() {
        return historialClinico;
    }

    public void setHistotialClinico(HistotialClinico historialClinico) {
        this.historialClinico = historialClinico;
    }
    
    
    
}
