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
public class CalculoSalarioLiquido {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Salário bruto:");
        Double salarioBruto = leitor.nextDouble();
        Double valorINSS = salarioBruto * 0.1;
        Double valorIR = salarioBruto * 0.2;
        System.out.println("Valor da condução:");
        Double valorCondução = leitor.nextDouble();
        Double valorVR = valorCondução * 2 * 22;

        Double salarioLiquido = salarioBruto - valorINSS - valorIR - valorVR;
        Double valorDescontos = valorINSS + valorIR + valorVR;

        System.out.println(
                "Seu salário bruto é R$" + salarioBruto
                + ", tem um total de R$" + valorDescontos
                + " em descontos e receberá um líquido de R$" + salarioLiquido);

    }

}
