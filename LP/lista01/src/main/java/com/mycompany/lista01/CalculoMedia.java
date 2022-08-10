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
public class CalculoMedia {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Nome:");
        String nome = leitor.nextLine();
        System.out.println("Primeira nota:");
        Double nota01 = leitor.nextDouble();
        System.out.println("Segunda nota:");
        Double nota02 = leitor.nextDouble();

        Double media = (nota01 + nota02) / 2;

        System.out.println(String.format(
                "Olá %s. Sua média foi de " + media, nome
        ));

    }
}
