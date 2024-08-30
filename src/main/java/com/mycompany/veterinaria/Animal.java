
package com.mycompany.veterinaria;


public abstract class  Animal {
// este simbolo # significa protected sirve para que los atributos sean usados solo por la clase principal y sus clases hijas
protected String especie;
protected String raza;
protected String nombre;

    public Animal(String especie, String raza, String nombre) {
        this.especie = especie;
        this.raza = raza;
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    
}
