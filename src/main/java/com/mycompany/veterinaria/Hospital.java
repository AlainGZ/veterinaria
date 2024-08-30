

package com.mycompany.veterinaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Hospital {

    public static void main(String[] args) {
        var app = new Hospital();
        app.inicializarHospital();
        app.mostrarMenuPrincipal();
        
        
    }
    
        private List<Cliente> clientes;
        private List<Veterinario> veterinario;
        private List<Producto> productos;
        
        
        private void inicializarHospital(){
            clientes = new ArrayList<>();
            
            
            
            var cliente = new Cliente(100001L, "cesar", "diaz",15);
            var mascota = new Mascota("firulais","sss","ddd", 1L);
            
            clientes.add(cliente);
            
             var cliente1 = new Cliente(100002L, "carlos", "perez",25);
            clientes.add(cliente);
            
             
        }
        
        
        
    public void mostrarMenuPrincipal(){
        
        var scanner = new Scanner(System.in);
        var salir = false;
        
        while(!salir){
        System.out.println("menu principal");
        System.out.println("------------");
        System.out.println("1. si quiere atender una mascota");
        System.out.println("2. Consultar una atencion");
        System.out.println("3. Listar clientes");
        
        System.out.println("Ingrese su opcion");
        var opcion = scanner.nextInt();
        
        
        
        switch(opcion){
            
            case 1:
                atenderMascota();
                
                break;
            case 2:
                consultarHistorialAtencion();
                break;
            case 3:
                listarClientes();
                
                
                break;
                
            case 0:
                salir = true;
                break;
            
            
        }
        
        }
    }

    private void atenderMascota() {
       
    }

    private void consultarHistorialAtencion() {
     
    }

    private void listarClientes() {
        System.out.println("clientes: ");
        
        for(var cliente : clientes){
            System.out.println(cliente);
        }
        
    }

    
    
}
