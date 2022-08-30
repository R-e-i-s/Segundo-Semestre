/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nivelamento2;

/**
 *
 * @author rafael.reis
 */
public class OperadorTernario {

    public static void main(String[] args) {

        Boolean isBloqueado = false;
        String frase;

//        if (isBloqueado) {
//            frase = "Usuário bloqueado";
//        } else {
//            frase = "Usuário desbloqueado";
//        }
//        System.out.println(frase);
        // Usando operador ternário
        frase = isBloqueado ? "Usuário Bloqueado!" : "Usuário Desbloqueado!";
        System.out.println(frase);

        Double salario = 1000.00;

        Double bonus = salario > 1000 ? 0.15 : 0.10;
        
        Double salarioComBonus = salario * bonus;
        System.out.println(salarioComBonus);    
    }
}
