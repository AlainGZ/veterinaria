
package com.mycompany.veterinaria;


public class Producto {
   
    private final Long codigo;
    private String nombre;
    private Double precio;

    public Producto(Long codigo, String nombre, Double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Long getCodigo() {
        return codigo;
    }
    
    
    
}
