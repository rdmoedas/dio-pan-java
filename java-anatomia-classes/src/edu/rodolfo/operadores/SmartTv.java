package edu.rodolfo.operadores;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void trocarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Trocando canal para: " + novoCanal);
    }

    public void mudarVolume(int novoVolume) {
        volume = novoVolume;
        System.out.println("Mudando volume para: " + novoVolume);
    }

    public void subirVolume() {
        volume++;
        System.out.println("Mudando volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Mudando volume para: " + volume);
    }

    public void subirCanal() {
        canal++;
        System.out.println("Mudando canal para: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Mudando canal para: " + canal);
    }
}
