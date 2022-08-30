/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3.rafael.reis.adsb;

import java.util.Scanner;

/**
 *
 * @author rafael.reis
 */
public class CalculaPesoidealMain {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CalculaPesoIdealMetodo calculaPesoIdealMetodo = new CalculaPesoIdealMetodo();
        
        System.out.println("Digite seu sexo:");
        String sexo = leitor.nextLine();
        System.out.println("Digite sua altura (em metros):");
        Double altura = leitor.nextDouble();
        
        Double pesoIdeal = calculaPesoIdealMetodo.calculaPesoIdeal(sexo, altura);
        
        System.out.println(String.format("Seu peso ideal é: %.2f", pesoIdeal));
        
    }
}
