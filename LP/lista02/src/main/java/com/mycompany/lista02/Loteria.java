/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author rafael.reis
 */
public class Loteria {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número desejado");
        Integer numDejesado = leitor.nextInt();
        Integer numAtealorio = ThreadLocalRandom.current().nextInt(0, 11);
        System.out.println(String.format("O número desejado é: %d", numDejesado));
        Integer numTentativas = 0;
        for (int i = 1; numAtealorio.equals(numDejesado); i++) {
            System.out.println("O número aleatório é:" + numAtealorio);
            System.out.println("Tentativas: " + i);
            numAtealorio = ThreadLocalRandom.current().nextInt(0, 11);
            numTentativas = i;
        }
        if (numTentativas <= 3) {
            System.out.println("Você é MUITO sortudo");
        } else if (numTentativas > 10) {
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        } else {
            System.out.println("Você é sortudo");
        }

    }
}
