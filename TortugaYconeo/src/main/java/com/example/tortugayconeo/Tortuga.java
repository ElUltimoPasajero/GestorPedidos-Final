package com.example.tortugayconeo;

class Tortuga implements Runnable {
@Override
public void run() {
        for (int i = 1; i <= Carrera.distancia; i++) {
        System.out.println("Tortuga: Metro " + i);
        try {
        // La tortuga tarda 5 segundos en recorrer cada metro
        Thread.sleep(5000);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }
        }
        }