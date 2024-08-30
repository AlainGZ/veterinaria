
package com.mycompany.veterinaria;

import java.util.ArrayList;
import java.util.List;


public class Veterinario extends Empleado  {
    
    private String especialidad;
    
    private List<Consulta>consultas;

    public Veterinario( Long cedula, String nombre, String apellido, int edad, Double sueldo, String especialidad) {
        super(cedula, nombre, apellido, edad, sueldo);
        this.especialidad = especialidad;
        consultas = new ArrayList<>();
    }

    public void agregarConsulta(Consulta consulta){
        consultas.add(consulta);
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }
            
   

    
    
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void calcularSueldo() {
        //TO DO implementar metodo
    }
    
    
    
}
