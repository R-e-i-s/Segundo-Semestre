package com.mycompany.lista01;

import java.util.Scanner;

/**
 *
 * @author rafael.reis
 */
public class CadastroUsuario {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu login:");
        String login = leitor.nextLine();
        System.out.println("Digite sua senha:");
        String senha = leitor.nextLine();
        System.out.println("Quantas vezes aceitas errar a senha:");
        Integer qtdErrosSenha = leitor.nextInt();
        System.out.println(String.format(
                "Seu login é %s e sua senha é %s. Você tem %d tentativas antes de ser bloqueado", login, senha, qtdErrosSenha
        ));
    }
}
