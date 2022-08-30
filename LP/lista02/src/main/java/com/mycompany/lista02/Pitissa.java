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
public class Pitissa {

    public static void main(String[] args) {
        Scanner teilor = new Scanner(System.in);

        Integer qtdVotosMuss = 0;
        Integer qtdVotosCala = 0;
        Integer qtdVotosQuatr = 0;
        String pizzaFavorita;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite seu voto:");
            Integer votoPizza = teilor.nextInt();
            switch (votoPizza) {
                case 5:
                    qtdVotosMuss++;
                    break;
                case 25:
                    qtdVotosCala++;
                    break;
                case 50:
                    qtdVotosQuatr++;
                    break;
                default:
                    System.out.println("Digite um valor válido");
                    i--;
            }
        }
        System.out.println("A pizza de mussarela recebeu " + qtdVotosMuss + " votos");
        System.out.println("A pizza de calabresa recebeu " + qtdVotosCala + " votos");
        System.out.println("A pizza de quatro queijos recebeu " + qtdVotosQuatr + " votos");
        String.format("", args);
        if (qtdVotosMuss > qtdVotosCala && qtdVotosMuss > qtdVotosQuatr) {
            pizzaFavorita = "Mussarela";
        } else if (qtdVotosCala > qtdVotosMuss && qtdVotosCala > qtdVotosQuatr) {
            pizzaFavorita = "Calabresa";
        } else if (qtdVotosQuatr > qtdVotosMuss && qtdVotosQuatr > qtdVotosCala) {
            pizzaFavorita = "Quatro Queijos";
        } else {
            pizzaFavorita = "Empate";
        }
        System.out.println(
                "O sabor de pizza favorito, de acordo com a pesquisa, é: " + pizzaFavorita
        );

    }
}
