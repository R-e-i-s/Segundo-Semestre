/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3.rafael.reis.adsb;

import java.util.Scanner;

/**
 *
 * @author rafael.reis
 * Professora, qual é o console que você usa, que fica todo bonitinho o output? (olher o exercício para entender)
 */
public class DescontoProgressivoMain {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DescontoProgressivoMetodo descontoProgressivo = new DescontoProgressivoMetodo();
        
        System.out.println("Bem-vindo ao sistema de desconto progressivo!");
        
        System.out.println("Digite o valor unitário do produto:");
        Double valorUnitarioProduto = leitor.nextDouble();
        System.out.println("Digite a quantidade:");
        Integer qtdProduto = leitor.nextInt();
        
        String notaFiscal = descontoProgressivo.exibirNotaFiscal(valorUnitarioProduto, qtdProduto);
        
        System.out.println(notaFiscal);
    }
}
