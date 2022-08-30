package com.mycompany.lista3.rafael.reis.adsb;

import java.util.Scanner;

public class VerificarPrimosMain {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        VerificarPrimosMetodo verificarPrimo = new VerificarPrimosMetodo();
        
        System.out.println("Digite um número:");
        Integer numPrimo = leitor.nextInt();
        
        while (numPrimo >= 0) {            
            Boolean isPrimo = verificarPrimo.verificarPrimo(numPrimo);
            System.out.println(isPrimo);
            System.out.println("Digite um número:");
            numPrimo = leitor.nextInt();
        }
    }
}
