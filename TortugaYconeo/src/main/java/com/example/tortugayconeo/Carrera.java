package com.example.tortugayconeo;

class Carrera {
    static int distancia = 10;

    public static void main(String[] args) {
        Tortuga tortuga = new Tortuga();
        Conejo conejo = new Conejo();

        Thread hiloTortuga = new Thread(tortuga);
        Thread hiloConejo = new Thread(conejo);

        hiloTortuga.start();
        hiloConejo.start();
    }
}
