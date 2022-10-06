package com.mycompany.lista06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class Frutas {

    public static void main(String[] args) {
        List<String> listaFrutas = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        listaFrutas.add("Maça");
        listaFrutas.add("Banana");
        listaFrutas.add("Melancia");
        listaFrutas.add("Limão");
        listaFrutas.add("Morango");
        listaFrutas.add("Laranja");

        System.out.println("Pesquisar Fruta");
        String frutaInput = leitor.nextLine();
        Integer contador = 0;
        
        for (int i = 0; i < listaFrutas.size(); i++) {
            if (frutaInput.equals(listaFrutas.get(i))) {
                contador++;
            }
        }
        if (contador >= 1) {
            System.out.println("A fruta " + frutaInput +" existe na lista.");
        } else {
            System.out.println("Não existe a fruta " + frutaInput + " na lista.");
        }
    }
}
