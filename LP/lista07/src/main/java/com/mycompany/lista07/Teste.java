package com.mycompany.lista07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class Teste {

    public static void main(String[] args) {
        List<Medicamento> listaMedicamentos = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        Scanner cringeScanner = new Scanner(System.in);
        String mensagemPrompt
                = "\nSeleciona a opção desejada:"
                + "\n1 - Cadastrar Medicamento"
                + "\n2 - Exibir Medicamentos"
                + "\n3 - Buscar Medicamento por nome"
                + "\n4 - Sair";

        System.out.println(mensagemPrompt);
        Integer opcaoEscolhida = scanner.nextInt();

        while (opcaoEscolhida != 4) {
            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("Você escolheu: Cadastrar medicamento");
                    System.out.println("Id:");
                    Integer id = scanner.nextInt();
                    System.out.println("Nome:");
                    String nome = cringeScanner.nextLine();
                    System.out.println("Quantidade de estoque:");
                    Integer qtdEstoque = scanner.nextInt();
                    System.out.println("Valor da venda:");
                    Double valorVenda = scanner.nextDouble();
                    listaMedicamentos.add(new Medicamento(id, nome, qtdEstoque, valorVenda));
                    System.out.println("Medicamento adicionado com sucesso");
                    break;
                case 2:
                    System.out.println("Medicamentos em estoque:");
                    for (Medicamento value : listaMedicamentos) {
                        System.out.println(value.toString());
                    }
                    break;
                case 3:
                    System.out.println("Nome do medicamento");
                    String medicamentoInput = cringeScanner.nextLine();
                    for (int i = 0; i < listaMedicamentos.size(); i++) {
                        if (listaMedicamentos.get(i).getNomeMedicamento().equals(medicamentoInput)) {
                            System.out.println("Medicamento desejado: \n" + listaMedicamentos.get(i).toString());
                            break;
                        }
                        if (i == listaMedicamentos.size() - 1) {
                            System.out.println("Medicamento não cadastrado");
                        }
                    }
                    break;
                case 4:

                    break;
                default:
                    System.out.println("Digite um valor válido!");
            }
            System.out.println(mensagemPrompt);
            opcaoEscolhida = scanner.nextInt();
        }
        System.out.println("Obrigado por utilizar! ^^");
    }
}
