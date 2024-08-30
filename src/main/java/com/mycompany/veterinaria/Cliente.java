
package com.mycompany.veterinaria;

import java.util.ArrayList;
import java.util.List;


public class Cliente extends Persona {
    
    
   private final List<Mascota> mascotas;

    public Cliente(Long cedula, String nombre, String apellido, int edad) {
        super(cedula, nombre, apellido, edad);
        mascotas = new ArrayList<>();
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void addMascota(Mascota mascota){
        //To Do: implementar un metodo
        mascotas.add(mascota);
    }
    
    @Override
    public String toString(){
        
       return "h" + getCedula()+ getNombre()+getApellido()+getEdad();
        
    }
}
