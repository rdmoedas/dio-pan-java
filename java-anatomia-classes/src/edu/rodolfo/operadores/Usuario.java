package edu.rodolfo.operadores;

public class Usuario {

    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        printTvStatus(smartTv);

        smartTv.ligar();
        smartTv.mudarVolume(15);
        smartTv.trocarCanal(5);

        smartTv.diminuirCanal();
        smartTv.subirVolume();

        printTvStatus(smartTv);
    }

    public static void printTvStatus(SmartTv smartTv) {
        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual ? " + smartTv.canal);
        System.out.println("Volume Atual ? " + smartTv.volume);
    }
    
}
