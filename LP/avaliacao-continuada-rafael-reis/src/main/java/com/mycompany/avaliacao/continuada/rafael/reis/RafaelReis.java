/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao.continuada.rafael.reis;

import java.util.Scanner;

/**
 *
 * @author rafael.reis
 */
public class RafaelReis {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String aLinha = "------------------------------";

        Double totalConta = 0.0;
        for (int i = 1; i <= 1; i++) {
            System.out.println(
                    aLinha
                    + "\n"
                    + " SPTech Investimentos        \n"
                    + aLinha
                    + "\n"
                    + " Olá, o que deseja fazer?     \n"
                    + " 1 - Depositar                    \n"
                    + " 2 - Sacar                          \n"
                    + " 3 - Simular rendimentos     \n"
                    + " 0 - Sair                            \n"
                    + aLinha
            );
            Integer respostaUsuario = leitor.nextInt();
            if (respostaUsuario.equals(0)) {
                System.out.println("Até mais! :D");
                break;
            } else if (respostaUsuario.equals(1)) {
                System.out.println("Depositar");
                System.out.println("Digite o valor a ser depositado:");
                Double valorDepositado = leitor.nextDouble();
                if (valorDepositado > 0) {
                    totalConta += valorDepositado;
                    System.out.println(String.format("Valor depositado com sucesso. Saldo atual: %.2f", totalConta));
                } else {
                    System.out.println("Erro: Valor inválido. Tente novamente");
                }
            } else if (respostaUsuario.equals(2)) {
                System.out.println("Sacar");
                System.out.println("Digite o valor a ser sacado:");
                Double valorSacado = leitor.nextDouble();
                if (valorSacado > 0 && valorSacado <= totalConta) {
                    totalConta -= valorSacado;
                    System.out.println(String.format("Valor sacado com sucesso. Saldo atual: %.2f", totalConta));
                } else {
                    System.out.println("Erro: Valor inválido. Tente novamente");
                }
            } else if (respostaUsuario.equals(3)) {
                System.out.println("Simular rendimentos");
                if (totalConta <= 0) {
                    System.out.println("Erro: Saldo zerado, opção inválida");
                } else {
                    Double simulacaoRendimentoDozeMeses = totalConta;
                    System.out.println(String.format("Saldo atual: %.2f\n%s", simulacaoRendimentoDozeMeses, aLinha));
                    for (int j = 1; j <= 12; j++) {
                        simulacaoRendimentoDozeMeses += simulacaoRendimentoDozeMeses * 0.1;
                        System.out.println(String.format("Mês %d | Saldo: %.2f \n%s", j, simulacaoRendimentoDozeMeses, aLinha));
                    }
                }
            } else {
                System.out.println("Erro: Valor inválido. Tente novamente");
            }
            i--;
        }
    }
}
