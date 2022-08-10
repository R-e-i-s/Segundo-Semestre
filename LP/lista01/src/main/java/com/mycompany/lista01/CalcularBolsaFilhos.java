package com.mycompany.lista01;

import java.util.Scanner;

/**
 *
 * @author rafael.reis
 */
public class CalcularBolsaFilhos {

    public static void main(String[] args) {

        Double valorBolsa0a3 = 25.12;
        Double valorBolsa4a16 = 15.88;
        Double valorBolsa17a18 = 12.44;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Filhos de 0 a 3:");
        Integer filhos0a3 = leitor.nextInt();
        System.out.println("Filhos de 4 a 16:");
        Integer filhos4a16 = leitor.nextInt();
        System.out.println("Filhos de 17 a 18:");
        Integer filhos17a18 = leitor.nextInt();

        Double totalBolsa
                = (filhos0a3 * valorBolsa0a3)
                + (filhos4a16 * valorBolsa4a16)
                + (filhos17a18 * valorBolsa17a18);
        Integer qtdFilhosTotal = filhos0a3 + filhos4a16 + filhos17a18;
        
//        System.out.println(totalBolsa);
        
        System.out.println(String.format(
                "Você tem um total de %d filhos e vai receber "
                + "R$" + totalBolsa + " de bolsa", qtdFilhosTotal));
                
//              Isso está sustentado pela força de vontade e sorte, mas funciona :D

    }

}
