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
public class CalculadoraTroco {

    public static void main(String[] args) {

        Double troco;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Valor unitário do produto:");
        Double valorUniProduto = leitor.nextDouble();
        System.out.println("Quantidade vendida do produto:");
        Integer qtdVendProduto = leitor.nextInt();
        System.out.println("Valor pago:");
        Double valorPago = leitor.nextDouble();

        troco = valorPago - (valorUniProduto * qtdVendProduto);
        
        System.out.println("Seu troco será de R$" + troco);

    }
}
