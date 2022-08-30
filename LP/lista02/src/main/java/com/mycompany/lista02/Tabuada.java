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
public class Tabuada {

    public static void main(String[] args) {

        Scanner teilor = new Scanner(System.in);

        System.out.println("Digite um número");
        Integer numTabuada = teilor.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(
                    String.format(
                            "%d X %d = " + numTabuada * i, numTabuada, i
                    ));
        }

    }
}
