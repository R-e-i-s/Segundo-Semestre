package com.mycompany.lista04;

/**
 *
 * @author rafae
 */
public class Encomenda {

    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorEncomenda;

    Double calcularFrete() {
        Double porcentagemTamanho;
        Double precoDistancia;
        switch (tamanho) {
            case "P":
                porcentagemTamanho = 0.01;
                break;
            case "M":
                porcentagemTamanho = 0.03;
                break;
            case "G":
                porcentagemTamanho = 0.05;
                break;
            default:
                throw new AssertionError();
        }
        if (distancia <= 50) {
            precoDistancia = 3.0;
        } else if (distancia > 200) {
            precoDistancia = 7.0;
        } else {
            precoDistancia = 5.0;
        }
        return (valorEncomenda * porcentagemTamanho) + precoDistancia;
    }

    void emitirEtiqueta() {
        Double valorFrete = calcularFrete();
        String mensagemEtiqueta
                = String.format(
                        "***ETIQUETA PARA ENVIO***\n"
                        + "Endereço do remetente: %s\n"
                        + "Endereço do destinatário: %s\n"
                        + "Tamanho: %s\n"
                        + "-----------------------------\n"
                        + "Valor encomenda: %.2f\n"
                        + "Valor frete: %.2f\n"
                        + "-----------------------------\n"
                        + "Valor total: %.2f",
                        enderecoRemetente,
                        enderecoDestinatario,
                        tamanho,
                        valorEncomenda,
                        valorFrete,
                        (valorFrete + valorEncomenda)
                );
        System.out.println(mensagemEtiqueta);
    }

}
