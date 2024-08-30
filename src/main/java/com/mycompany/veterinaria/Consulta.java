
package com.mycompany.veterinaria;

import java.time.LocalDateTime;


public class Consulta {
  
    private final Long id;
    private LocalDateTime fecha;
    private String descripcion;

    public Consulta(Long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    
   public Consulta(Long id,Integer ania, Integer mes,Integer dia, String descripcion){
       
       this(id, descripcion);
        int anio = 0;
       fecha =  LocalDateTime.of(anio, mes, dia, 0, 0);
   }
   
   public void relacionConObjetos(Mascota mascota,Veterinario veterinario ){
       //To do implementar metodo
   }

    public Long getId() {
        return id;
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
   
   
}
