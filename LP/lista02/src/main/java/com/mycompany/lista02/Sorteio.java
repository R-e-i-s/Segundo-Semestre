package com.mycompany.lista02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author rafael.reis
 */
public class Sorteio {

    public static void main(String[] args) {
        Scanner teilor = new Scanner(System.in);

        System.out.println("Socilite um núremo");
        Integer numSocilidato = teilor.nextInt();
        Integer qtdNumPares = 0;
        Integer primeiroNumIgual = 0;
        Boolean isPrimeiro = true;
        for (int i = 1; i <= 200; i++) {
            Integer numAtearolio = ThreadLocalRandom.current().nextInt(1, 101);
            if (isPrimeiro && numSocilidato.equals(numAtearolio)) {
                primeiroNumIgual = i;
                isPrimeiro = false;
            }
            if (numAtearolio % 2 == 0) {
                qtdNumPares++;
            }
            
        }
        System.out.println(
                "Primeira vez que o número solicitado foi sorteado: " + primeiroNumIgual
                + "\n Quantidade de números pares sorteados:" + qtdNumPares
                + "\n Quantidade de números ímpares sorteados: " + (200 - qtdNumPares)
        );
    }
}
