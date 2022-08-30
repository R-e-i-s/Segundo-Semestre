/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nivelamento2;

/**
 *
 * @author rafael.reis
 */
public class Interpolacao {

    public static void main(String[] args) {

//        %s representa String
//        %d representa Integer
//        %.2f para double com 2 casas decimais  
        String nome = "Rafael";
        Integer idade = 18;
        Double altura = 1.839637253928364527;
        
        Integer decimalPlace = 6;
        
        Double n = altura * Math.pow(10, decimalPlace);
        n = Math.floor(n);
        n = n/Math.pow(10, decimalPlace);
        
        
        System.out.println(n);
        
        
        System.out.println(String.format(
                "Meu nome é %s, tenho %d de idade, e %.2f de altura",
                nome,
                idade,
                altura));

    }
}
