/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author rafae
 */
public class TestePokemon {
    
    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon();
        Pokemon pokemon2 = new Pokemon();
        TreinadorPokemon treinadorPokemon = new TreinadorPokemon();
        
        pokemon1.setNome("VOARA");
        pokemon1.setForca(5.0);
        pokemon1.setTipo("Planta");
        
        pokemon2.setNome("VARACAPI");
        pokemon2.setForca(18.0);
        pokemon2.setTipo("Água");
        
        treinadorPokemon.setNivel(0);
        treinadorPokemon.setNome("Rafinha");
        
        treinadorPokemon.treinarPokemon(pokemon1);
        treinadorPokemon.treinarPokemon(pokemon1);
        treinadorPokemon.treinarPokemon(pokemon1);
        treinadorPokemon.treinarPokemon(pokemon1);
        treinadorPokemon.treinarPokemon(pokemon1);
        
        System.out.println(String.format(
                "Pokemon: "
                + "\nNome: %s; "
                + "\nTipo: %s; "
                + "\nForça: %.2f; "
                + "\nDoces: %d",
                pokemon1.getNome(),
                pokemon1.getTipo(),
                pokemon1.getForca(),
                pokemon1.getDoces()));
        
        treinadorPokemon.evoluirPokemon(pokemon1, "AZURARA");
        
        System.out.println(String.format(
                "Pokemon: "
                + "\nNome: %s; "
                + "\nTipo: %s; "
                + "\nForça: %.2f; "
                + "\nDoces: %d",
                pokemon1.getNome(),
                pokemon1.getTipo(),
                pokemon1.getForca(),
                pokemon1.getDoces()));
        
        treinadorPokemon.treinarPokemon(pokemon2);
        treinadorPokemon.treinarPokemon(pokemon2);
        System.out.println(String.format(
                "Pokemon: "
                + "\nNome: %s; "
                + "\nTipo: %s; "
                + "\nForça: %.2f; "
                + "\nDoces: %d",
                pokemon2.getNome(),
                pokemon2.getTipo(),
                pokemon2.getForca(),
                pokemon2.getDoces()));
        treinadorPokemon.evoluirPokemon(pokemon2, "CAPILORDE");
        System.out.println(String.format("Treinador: \nNome: %s; \nNivel: %d", treinadorPokemon.getNome(), treinadorPokemon.getNivel()));
    }
}
