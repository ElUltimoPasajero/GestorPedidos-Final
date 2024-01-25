package com.example.demostracionhilos_1;

public class Principal {

    public static void main(String[]args){

        // Creación de tres instancias de la clase Concurrente con nombres diferentes.
        Concurrente c1= new Concurrente("Tarea 1");
        Concurrente c2= new Concurrente("Tarea 2");
        Concurrente c3= new Concurrente("Tarea 3");

        // Inicia los tres hilos.
        c1.start();
        c2.start();
        c3.start();
        System.out.println("El metodo main() ha finalizado");




    }
}
