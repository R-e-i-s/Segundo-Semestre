package com.mycompany.lista01;

import java.util.Scanner;

/**
 *
 * @author rafael.reis
 */
public class Idade {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Nome:");
        String nome = leitor.nextLine();
        System.out.println(String.format(
                "Olá, %s! Qual o ano de seu nascimento?", nome
        ));
        Integer anoDesej = 2030;
        Integer anoNasc = leitor.nextInt();
        System.out.println("Em " + anoDesej + " você terá " + (anoDesej - anoNasc ) + " anos");
    }
}
