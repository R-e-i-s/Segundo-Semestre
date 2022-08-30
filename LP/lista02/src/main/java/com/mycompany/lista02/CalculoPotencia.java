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
public class CalculoPotencia {

    public static void main(String[] args) {
        Scanner teilor = new Scanner(System.in);

        System.out.println("Digite o núremo Base:");
        Integer numBase = teilor.nextInt();
        System.out.println("Digite o núremo Expoente:");
        Integer numExpoente = teilor.nextInt();
        Integer numCalculoValor = 1;

        for (int i = 1; i <= numExpoente; i++) {
            numCalculoValor *= numBase;
        }

        System.out.println(numCalculoValor);
    }
}
