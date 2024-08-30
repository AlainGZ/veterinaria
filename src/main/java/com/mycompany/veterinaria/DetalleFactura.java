
package com.mycompany.veterinaria;


public class DetalleFactura {
    private Integer cantidad;

    public DetalleFactura(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    public Double getTotal(){
        return 0d;
        //To Do implementar metodo
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
