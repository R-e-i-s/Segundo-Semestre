package com.mycompany.teste;

import java.util.Scanner;

/**
 *
 * @author rafael.reis
 */
public class loop_sem_loop {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma qtd n");
        int numero = leitor.nextInt();
        int soma = 0;
        for (int i = 0; i <= numero; i++) {
            soma += i;
        }
        System.out.println(soma);
    }

}
