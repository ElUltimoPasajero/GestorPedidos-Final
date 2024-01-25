package com.example.tortugayconeo;

class Conejo implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= Carrera.distancia; i++) {
            System.out.println("Conejo: Metro " + i);
            try {
                // El conejo tarda 1 segundo en recorrer cada metro
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}