package com.mycompany.primeiro.nivelamento;

import java.util.Scanner;

/**
 *
 * @author rafael.reis
 */
public class LeituraEscrita {

    public static void main(String[] args) {
        try {

//          Utilizaremos o scanner para ler valores do console
//          Sempre que tem o new estamos INSTANCIANDO um objeto.
//          Ou seja, criando um objeto
            Scanner leitor = new Scanner(System.in); // Cria um novo Scanner

            System.out.println("Digite seu primeiro nome: ");
            String primNome = leitor.nextLine(); // Dá o valor recebido do objeto leitor (input do usuário) à variável primNome

            System.out.println("Digite seu sobrenome; ");
            String sobreNome = leitor.nextLine(); // Dá o valor recebido do objeto leitor (input do usuário) à variável sobreNome

            System.out.println("Digite sua idade: ");
            Integer idade = leitor.nextInt();

            System.out.println("Digite sua altura: ");
            Double altura = leitor.nextDouble();

            System.out.println(
                    "Olá, meu nome completo é " + primNome + " " + sobreNome
                    + ".\nTenho " + idade + " anos de idade e tenho "
                    + altura + " de altura."
            );
        } catch (Exception error) {
            System.out.println("Erro: valor inválido digitado");
        }
    }

}
