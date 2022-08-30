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
public class ClassesSociaisMain {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        ClassesSociaisMetodo verificaClasse = new ClassesSociaisMetodo();
        
        
        System.out.println("Informe sua renda:");
        Double rendaUser = leitor.nextDouble();
        
        Double qtdSalariosMin = verificaClasse.calcQtdSalariosMin(rendaUser);
        String classeSocial = verificaClasse.identificarClasse(rendaUser);
        
        System.out.println(String.format("Você recebe aproximadamente %.1f salários mínimo.", qtdSalariosMin));
        System.out.println("Você pertence à classe social: " + classeSocial);
        
    }
    
}
