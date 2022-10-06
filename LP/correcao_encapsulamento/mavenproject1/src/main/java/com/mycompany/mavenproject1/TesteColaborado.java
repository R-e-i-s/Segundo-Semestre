package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafae
 */
public class TesteColaborado {
    public static void main(String[] args) {
        Colaborador colab01 = new Colaborador("Rafael", "Esgatiário", 1000000.00);
        Colaborador colab02 = new Colaborador("Damasceno", "CEO", 1000.00);
        RecursosHumanos recursosHumanos = new RecursosHumanos();
        
        List<Colaborador> listaColaborador = new ArrayList<>();
        
        listaColaborador.add(colab01);
        listaColaborador.add(colab02);
        System.out.println(colab01);
        
        System.out.println(listaColaborador);
        
        System.out.println(recursosHumanos);
    }
}
