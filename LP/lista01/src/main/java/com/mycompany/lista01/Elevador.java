package com.mycompany.lista01;

import java.util.Scanner;

/**
 *
 * @author rafael.reis
 */
public class Elevador {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Limite de peso:");
        Integer limitePeso = leitor.nextInt();
        System.out.println("Limite de pessoas:");
        Integer limitePessoas = leitor.nextInt();
        System.out.println("Peso da primeira pessoa:");
        Double pesoPessoa01 = leitor.nextDouble();
        System.out.println("Peso da segunda pessoa:");
        Double pesoPessoa02 = leitor.nextDouble();
        System.out.println("Peso da terceira pessoa:");
        Double pesoPessoa03 = leitor.nextDouble();

        Double pesoTotal = pesoPessoa01 + pesoPessoa02 + pesoPessoa03;

        System.out.println(
                "Entraram 3 pessoas no elevador, no qual cabem " + limitePessoas + " pessoas.\n"
                + "O peso total no elevador é de " + pesoTotal + ", sendo que ele suporta " + limitePeso
        );

    }
}
