package com.mycompany.lista3.rafael.reis.adsb;

import java.util.Scanner;

/**
 *
 * @author rafael.reis Olá professora :D
 */
public class ClassificaIdadeMain {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ClassificaIdadeMetodo classificaIdade = new ClassificaIdadeMetodo();
        
        System.out.println("Digite sua idade:");
        Integer idadeInputada = leitor.nextInt();
        classificaIdade.ClassificarIdade(idadeInputada);
        
    }

}
