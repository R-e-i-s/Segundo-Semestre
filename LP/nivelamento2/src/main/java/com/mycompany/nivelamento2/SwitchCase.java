/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nivelamento2;

import java.util.Scanner;

/**
 *
 * @author rafael.reis
 */
public class SwitchCase {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um dia da semana:");
        Integer numDiaDaSemana = leitor.nextInt();
        String strDiaDaSemana;

        switch (numDiaDaSemana) {
            case 1:
                strDiaDaSemana = "Segundou";
                break;
            case 2:
                strDiaDaSemana = "Terçou";
                break;
            case 3:
                strDiaDaSemana = "Quartou";
                break;
            case 4:
                strDiaDaSemana = "Quintou";
                break;
            case 5:
                strDiaDaSemana = "Sextou";
                break;
            case 6:
                strDiaDaSemana = "Sabadou";
                break;
            case 7:
                strDiaDaSemana = "Domingou do Fastou";
                break;
            default:
                strDiaDaSemana = "Só existem 10 dias da semana seu bobinhu";
        }
        System.out.println(strDiaDaSemana);
    }
}
