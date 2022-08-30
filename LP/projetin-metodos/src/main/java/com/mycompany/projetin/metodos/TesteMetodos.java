package com.mycompany.projetin.metodos;

public class TesteMetodos {

    public static void main(String[] args) {

//      Nosso próprio objeto
//      Instânciando a classe Ulititaria
//        Ulititaria util;
//      Invocando nosso método
//        util = new Ulititaria();
//
//        util.ebixirLinha();
//
//        util.exibirNome("Rafael");
//        
//        util.exibirNomeDecorado("Rafinha");
//        String resposta = util.receberPrompt("Quantos anos você tem?");
//        Integer idade = Integer.parseInt(resposta);
//        System.out.println(String.format("Você tem %d anos de idade", idade));
        Calculadora calc = new Calculadora();
        Leitor respostaPrompt = new Leitor();
        String nome = respostaPrompt.getStringFromUser("Escreva seu nome");
        Double num1 = respostaPrompt.getDoubleFromUser("Escreva o primeiro número");
        Double num2 = respostaPrompt.getDoubleFromUser("Escreva o segundo número");

        Double soma = calc.somar(num1, num2);

        System.out.println(String.format("Olá %s, a soma deu: %.1f", nome, soma));

        if (calc.isPar(41.0)) {
            System.out.println("É par!");
        } else {
            System.out.println("É ímpar");
        }
        
        if (calc.isPrimo(29)) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }

    }
}
