package com.mycompany.listas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafae
 */
public class Teste {
    public static void main(String[] args) {
        List listEstranha = new ArrayList();
        
        listEstranha.add("oi");
        listEstranha.add("ola");
        listEstranha.add(false);
        listEstranha.add(42.11);
        listEstranha.add(1, "entrei no lugar hihihi");
        
        System.out.println(listEstranha);
        
        List<String> nomes = new ArrayList();
        nomes.add("Damasceno");
        nomes.add("César");
        nomes.add("Dada");
        
        System.out.println(nomes);
        
        for (int i = 0; i < nomes.size(); i++) {
            String nome = nomes.get(i);
            if (nome.startsWith("D")) {
                System.out.println("uau " + i);
            }
            System.out.println(nomes.contains("Dada"));
        }
            nomes.clear();
            System.out.println(nomes);
    }
}
