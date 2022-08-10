package com.mycompany.primeiro.nivelamento;

/**
 *
 * @author rafael.reis
 */
public class Operadores {

    public static void main(String[] args) {

        Double numero01 = 10.0;
        Double numero2 = 3.0;

        System.out.println("Soma: " + (numero01 + numero2));
        System.out.println("Subtração: " + (numero01 - numero2));
        System.out.println("Multiplicação: " + (numero01 * numero2));
        System.out.println("Divisão: " + (numero01 / numero2));
        System.out.println("Resto:" + (numero01 % numero2));
        System.out.println("Potenciação: " + (Math.pow(numero01, numero2)));

    }
}
