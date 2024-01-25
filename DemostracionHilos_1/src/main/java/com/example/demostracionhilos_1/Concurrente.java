package com.example.demostracionhilos_1;

import java.security.SecureRandom;

public class Concurrente extends Thread{
    private final int tiempo;  // Tiempo que la tarea pasará dormida.
    private final String nombre;  // Nombre de la tarea.
    private SecureRandom generador = new SecureRandom();  // Generador de números aleatorios seguro.

    // Constructor que inicializa el tiempo y el nombre de la tarea.
    public Concurrente(String nombreTarea) {
        this.tiempo = generador.nextInt(5000);  // Genera un tiempo aleatorio entre 0 y 5000 milisegundos.
        this.nombre = nombreTarea;
    }

    @Override
    public void run() {
        // Muestra un mensaje indicando que la tarea se fue a dormir durante cierto tiempo.
        System.out.printf("%s se ha ido a dormir durante %d segundos%n", nombre, tiempo);

        try {
            Thread.sleep(tiempo);  // Hace que el hilo (thread) duerma durante el tiempo generado.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}