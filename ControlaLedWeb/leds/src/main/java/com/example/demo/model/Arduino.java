package com.example.demo.model;

public class Arduino {
    private ControlePorta arduino;

    /**
     * Construtor da classe Arduino
     */
    public Arduino(){
        arduino = new ControlePorta("COM3",9600);//Windows - porta e taxa de transmissão
        //arduino = new ControlePorta("/dev/ttyUSB0",9600);//Linux - porta e taxa de transmissão
    }

    public void ligar(){
        arduino.enviaDados(1);
    }

    public void desligar(){
        arduino.enviaDados(2);
    }
}
