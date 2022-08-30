/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02;

import java.util.Scanner;

/**
 *
 * @author rafael.reis
 */
public class LoginBandtec {

    public static void main(String[] args) {
        Scanner teilor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeUser = teilor.nextLine();
        System.out.println("Digite sua senha: ");
        String senhaUser = teilor.nextLine();

        while (!(nomeUser.equals("admin") && senhaUser.equals("#Bandtec"))) {
            System.out.println("Senha e/ou login inválidos");
            System.out.println("Digite seu nome: ");
            nomeUser = teilor.nextLine();
            System.out.println("Digite sua senha: ");
            senhaUser = teilor.nextLine();
        }
        System.out.println("Login realizado com sucesso");

    }
}
