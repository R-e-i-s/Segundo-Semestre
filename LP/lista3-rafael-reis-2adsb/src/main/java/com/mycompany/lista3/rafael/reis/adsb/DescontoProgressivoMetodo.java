/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3.rafael.reis.adsb;

/**
 *
 * @author rafael.reis
 */
public class DescontoProgressivoMetodo {

    Double calcularDesconto(Double valorUnitario, Integer qtdProduto) {
        Double desconto;
        Double valorFinal;

        if (qtdProduto < 0) {
            desconto = 0.0;
        } else if (qtdProduto.equals(1)) {
            desconto = 0.1;
        } else if (qtdProduto.equals(2)) {
            desconto = 0.2;
        } else {
            desconto = 0.3;
        }
        valorFinal = (valorUnitario * qtdProduto) - (valorUnitario * qtdProduto * desconto);

        return valorFinal;
    }

    String exibirNotaFiscal(Double valorUnitario, Integer qtdProduto) {
        Double valorDescontado = calcularDesconto(valorUnitario, qtdProduto);
        String barraSeparadora = "-----------------------------------------------";

        String notaEscrita = String.format(barraSeparadora + "\n"
                + "Valor do Produto: R$" + "%.2f" + "\n"
                + "Quantidade: " + qtdProduto + "\n"
                + barraSeparadora + "\n"
                + "Valor com desconto: R$" + "%.2f",
                valorUnitario, valorDescontado);

        return notaEscrita;
    }

}
