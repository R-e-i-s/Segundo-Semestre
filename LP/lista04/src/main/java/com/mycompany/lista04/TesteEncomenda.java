/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista04;

/**
 *
 * @author rafae
 */
public class TesteEncomenda {
    public static void main(String[] args) {
        Encomenda encomenda1 = new Encomenda();
        Encomenda encomenda2 = new Encomenda();
        encomenda1.distancia = 150.0;
        encomenda1.enderecoDestinatario = "Rua das flores 1000";
        encomenda1.enderecoRemetente = "Rua das Rosas 1500";
        encomenda1.tamanho = "P";
        encomenda1.valorEncomenda = 87.99;
        
        encomenda1.emitirEtiqueta();
        
        encomenda2.distancia = 250.0;
        encomenda2.enderecoDestinatario = "Rua das Marias 218";
        encomenda2.enderecoRemetente = "Rua das Cachecóis 12";
        encomenda2.tamanho = "G";
        encomenda2.valorEncomenda = 29.99;
        
        encomenda2.emitirEtiqueta();;
        
    }
}
