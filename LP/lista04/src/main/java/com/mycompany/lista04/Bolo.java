package com.mycompany.lista04;

/**
 *
 * @author rafae
 */
public class Bolo {

    String sabor;
    Double valor;
    Integer qtdVendida = 0;

    void comprarBolo(Integer qtdBolos) {
        if (qtdVendida + qtdBolos > 100) {
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo.");
        } else if (qtdBolos <= 0) {
            System.out.println("ERRO: VALOR INVÁLIDO");
        } else {
            System.out.println("Obrigado por comprar nosso bolo :D");
            qtdVendida += qtdBolos;
        }
    }

    void exibirRelatorio() {
        System.out.println(
                "O bolo sabor " + sabor
                + ", foi comprado " + qtdVendida
                + " hoje, totalizando R$" + (valor * qtdVendida)
        );
    }
}
