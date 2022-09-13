package com.mycompany.lista04;

/**
 *
 * @author rafae
 */
public class App {
    public static void main(String[] args) {
        Bolo bolo01 = new Bolo();
        Bolo bolo02 = new Bolo();
        Bolo bolo03 = new Bolo();
        
        bolo01.sabor = "Cholocate";
        bolo01.valor = 35.00;
        
        bolo02.sabor = "Morango";
        bolo02.valor = 40.00;
        
        bolo03.sabor = "Acaxabi";
        bolo03.valor = 50.00;
        
        bolo01.comprarBolo(20);
        bolo01.comprarBolo(30);
        bolo01.comprarBolo(15);
        bolo01.exibirRelatorio();
        
        bolo02.comprarBolo(5);
        bolo02.comprarBolo(30);
        bolo02.comprarBolo(65);
        bolo02.exibirRelatorio();
        
        bolo03.comprarBolo(40);
        bolo03.comprarBolo(-50);
        bolo03.comprarBolo(20);
        bolo03.exibirRelatorio();
        
        
    }
}
