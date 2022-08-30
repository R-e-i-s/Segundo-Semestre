/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02;

import java.util.Scanner;

/**
 *
 * @author rafael.reis
 */
public class Acumulador {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o número");
        Integer numIpt = leitor.nextInt();
        Integer alucumador = 0;

        while (numIpt != 0) {
            alucumador += numIpt;
            System.out.println("Valor total: " + alucumador);
            System.out.println("Insira o número");
            numIpt = leitor.nextInt();

        }
        System.out.println("Valor total: " + alucumador);

    }
}
