/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetin.metodos;

import java.util.Scanner;

/**
 *
 * @author rafael.reis
 */
public class Leitor {
    
    Double getDoubleFromUser(String descricao){
        Scanner leitor = new Scanner(System.in);
        System.out.println(descricao);
        Double resposta = leitor.nextDouble();
        return resposta;
    }
    Integer getIntegerFromUser(String descricao){
        Scanner leitor = new Scanner(System.in);
        System.out.println(descricao);
        Integer resposta = leitor.nextInt();
        return resposta;
    }
    String getStringFromUser(String descricao) {
        Scanner leitor = new Scanner(System.in);
        System.out.println(descricao);
        String resposta = leitor.nextLine();
        return resposta;
    }
    
}
