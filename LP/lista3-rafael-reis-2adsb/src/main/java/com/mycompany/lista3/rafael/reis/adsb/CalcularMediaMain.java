package com.mycompany.lista3.rafael.reis.adsb;

import java.util.Scanner;

public class CalcularMediaMain {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        CalcularMediaMetodo calc = new CalcularMediaMetodo();

        System.out.println("Digite o primeiro número:");
        Double num1 = leitor.nextDouble();
        System.out.println("Digite o segundo número:");
        Double num2 = leitor.nextDouble();

        Double media = calc.calcularMedia(num1, num2);
        
        
        
        System.out.println(media);
    }
}
