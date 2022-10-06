package com.mycompany.lista06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class ListaInteiros {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<>();
        Integer menorNumero = 0;
        Integer maiorNumero = 0;
        Integer somaNumeros = 0;
        Boolean primeiraVez = true;
        List<Integer> listaPares = new ArrayList<>();
        List<Integer> listaImpares = new ArrayList<>();

        System.out.println("Digite seu número");
        Integer numeroInput = leitor.nextInt();

        while (numeroInput != 0) {
            listaNumeros.add(numeroInput);
            if (primeiraVez) {
                menorNumero = numeroInput;
                maiorNumero = numeroInput;
            }
            if (numeroInput > maiorNumero) {
                maiorNumero = numeroInput;
            }
            if (numeroInput < menorNumero) {
                menorNumero = numeroInput;
            }
            if (numeroInput % 2 == 0) {
                listaPares.add(numeroInput);
            } else {
                listaImpares.add(numeroInput);
            }
            somaNumeros += numeroInput;
            System.out.println("Digite seu número");
            numeroInput = leitor.nextInt();
        }
        System.out.println("Todos os números");
        System.out.println(listaNumeros);
        System.out.println("Números pares");
        System.out.println(listaPares);
        System.out.println("Números ímpares");
        System.out.println(listaImpares);
        System.out.println("Soma");
        System.out.println(somaNumeros);
        System.out.println("Menor número");
        System.out.println(menorNumero);
        System.out.println("Maior número");
        System.out.println(maiorNumero);
    }
}
