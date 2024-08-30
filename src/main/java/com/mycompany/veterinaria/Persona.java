
package com.mycompany.veterinaria;


public abstract class Persona {
    
    private Long cedula;
    private String nombre;
    private String apellido;
    private Integer edad;

    public Persona(Long cedula, String nombre, String apellido, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return edad;
    }

   

    
}
