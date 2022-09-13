package com.mycompany.lista04;

/**
 *
 * @author rafae
 */
public class Termometro {

    Double temperaturaAtual;
    Double temperaturaMax;
    Double temperaturaMin;

    void aumentarTemperatura(Double novaTemperatura) {
        if (novaTemperatura < temperaturaAtual) {
            System.out.println("ERRO: TEMPERATURA NOVA MENOR QUE TEMPERATURA ATUAL");
        } else if (novaTemperatura > temperaturaMax) {
            novaTemperatura = temperaturaMax;
            System.out.println("Bateu no teto");
            temperaturaAtual = novaTemperatura;
            System.out.println("Nova temperatura atual: " + temperaturaAtual);
        } else {
            temperaturaAtual = novaTemperatura;
            System.out.println("Nova temperatura atual: " + temperaturaAtual);
        }
    }

    void diminuirTemperatura(Double novaTemperatura) {
        if (novaTemperatura > temperaturaAtual) {
            System.out.println("ERRO: TEMPERATURA NOVA MAIOR QUE TEMPERATURA ATUAL");
        } else if (novaTemperatura < temperaturaMin) {
            novaTemperatura = temperaturaMin;
            System.out.println("Quicou no chão");
            temperaturaAtual = novaTemperatura;
            System.out.println("Nova temperatura atual: " + temperaturaAtual);
        } else {
            temperaturaAtual = novaTemperatura;
            System.out.println("Nova temperatura atual: " + temperaturaAtual);
        }

    }

    void exibirFahreinheint() {
        System.out.println("Temperatura em Fahreinheint: " + (temperaturaAtual * 1.8 + 32));
    }

}
