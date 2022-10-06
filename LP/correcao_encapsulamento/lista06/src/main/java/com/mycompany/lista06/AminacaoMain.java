/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista06;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafae
 */
public class AminacaoMain {
    public static void main(String[] args) {
        List<Aminacao> listaAminacao = new ArrayList();
        
        Aminacao aminacao01 = new Aminacao("Procurando Nemo", 2003, 2.30);
        Aminacao aminacao02 = new Aminacao("Shrek", 2001, 1.50);
        
        listaAminacao.add(aminacao01);
        listaAminacao.add(aminacao02);
        listaAminacao.add(new Aminacao("Homem Aranha no Aranhaverso", 2018, 2.10));
        
        for (int i = 0; i < listaAminacao.size(); i++) {
            if (listaAminacao.get(i).getNome().equals("Procurando ")) {
                System.out.println("Maluco funfou na vez " + (i  + 1));
                break;
            }
            if (i == listaAminacao.size() - 1) {
                System.out.println("Não existe na lista");
            }
        }
        List ola = new ArrayList();
        for (Object object : ola) {
            
        }
    }
}
