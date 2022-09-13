/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista04;

/**
 *
 * @author rafae
 */
public class TesteTermometro {
    public static void main(String[] args) {
        Termometro termometro = new Termometro();
        
        termometro.temperaturaAtual = 22.4;
        termometro.temperaturaMax = 40.0;
        termometro.temperaturaMin = 12.0;
        
        termometro.aumentarTemperatura(30.0);
        termometro.aumentarTemperatura(30.1);
        termometro.aumentarTemperatura(28.0);
        termometro.aumentarTemperatura(45.0);
        
        termometro.diminuirTemperatura(35.9);
        termometro.diminuirTemperatura(20.0);
        termometro.diminuirTemperatura(30.1);
        termometro.diminuirTemperatura(0.0);
        
        termometro.exibirFahreinheint();
        
        
    }
}
