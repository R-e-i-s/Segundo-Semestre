/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nivelamento2;

import java.util.Scanner;

/**
 *
 * @author rafael.reis
 */
public class LacosRepeticao {

    public static void main(String[] args) {
//        System.out.println("Laço For - 0 a 10");
//        for (double i = 0.0; i <= 10; i+= 0.1) {
//            System.out.println(i);
//        }

        Scanner leitor = new Scanner(System.in);
//        System.out.println("Adivinhe o número");
//        Integer numDigitado = leitor.nextInt();
//
//        while (numDigitado != 42) {
//            System.out.println("ERROUUUUUUUUUUU. TENTE DENOVO");
//            numDigitado = leitor.nextInt();
//        }
//        System.out.println("ACERTOUUUUUUUUU");

        int i;
        do {
            i = leitor.nextInt();
            System.out.println(i);
        } while (i != 18);
        System.out.println("Boa campeão");
        
    }
}
