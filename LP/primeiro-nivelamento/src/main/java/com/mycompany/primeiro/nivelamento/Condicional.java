package com.mycompany.primeiro.nivelamento;

/**
 *
 * @author rafael.reis
 */
public class Condicional {

    public static void main(String[] args) {
        
//        > maior
//        < menor
//        >= maior igual
//        >= menor igual

        
        Integer numero01 = 100;
        Integer numero02 = 100;
        if (numero01 > numero02) {
            System.out.println(numero01 + " é maior que " + numero02);
        } else if (numero01 < numero02){
            System.out.println(numero01 + " é menor que" + numero02);
        } else if (numero01 == numero02) {
            System.out.println(numero01 + " é igual a " + numero02);
        }
        
        
        String nome01 = "João";
        String nome02 = "João";
        String nome03;
        
        // SE COMPARA STRING COM == TU VAI APANHAR MALANDRO
//        VAI COMPARA DESSA MANEIRA ENTÃO SEU FDP
            if(nome01.equals(nome02)) {
                System.out.println("Iguais");
            } else {
                System.out.println("Diferentes");
            }
            
//            CASO CASE NÃO IMPORTA
            if (nome01.equalsIgnoreCase(nome02)){
                
            }
            
    }
    
}
