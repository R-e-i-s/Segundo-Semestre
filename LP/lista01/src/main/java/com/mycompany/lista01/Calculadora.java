/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista01;

import java.util.Scanner;

/**
 *
 * @author rafael.reis
 */
public class Calculadora {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Primeiro número:");
        Double num01 = leitor.nextDouble();
        System.out.println("Segundo número:");
        Double num02 = leitor.nextDouble();

        System.out.println(
                "\n Resultado da soma:"
                + "\n" + (num01 + num02)
                + "\n Resultado da subtração:"
                + "\n" + (num01 - num02)
                + "\n Resultado da multiplicação:"
                + "\n" + (num01 * num02)
                + "\n Resultado da divisão:"
                + "\n" + (num01 / num02)
        );

    }

}
