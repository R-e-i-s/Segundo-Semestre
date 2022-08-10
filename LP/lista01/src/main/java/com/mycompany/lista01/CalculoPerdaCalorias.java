/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista01;

import java.util.Scanner;

/**
 *
 * @author rafael.reis
 */
public class CalculoPerdaCalorias {

    public static void main(String[] args) {

        Integer calPorMinAque = 12;
        Integer calPorMinAero = 20;
        Integer calPorMinMusc = 25;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Tempo se aquecendo:");
        Integer aquecimentoMinut = leitor.nextInt();
        System.out.println("Tempo em aeróbicos:");
        Integer aerobicosMinut = leitor.nextInt();
        System.out.println("Tempo em musculação:");
        Integer musculacaoMinut = leitor.nextInt();

        Integer qtdMinutTotal
                = aquecimentoMinut
                + aerobicosMinut
                + musculacaoMinut;

        Integer qtdCaloriasPerdidas
                = (aquecimentoMinut * calPorMinAque)
                + (aerobicosMinut * calPorMinAero)
                + (musculacaoMinut * calPorMinMusc);

        System.out.println(String.format(
                "Olá Giu, Você fez um total de "
                + "%d minutos de exercícios e perdeu cerca de "
                + "%d calorias.", qtdMinutTotal, qtdCaloriasPerdidas
        ));
    }
}
