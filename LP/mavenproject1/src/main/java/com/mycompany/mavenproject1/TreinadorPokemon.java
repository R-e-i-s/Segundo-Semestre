package com.mycompany.mavenproject1;

/**
 *
 * @author rafae
 */
public class TreinadorPokemon {

    private String nome;
    private Integer nivel;

    public String getNome() {
        return nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    void treinarPokemon(Pokemon pokemon) {
        System.out.println(String.format("Pokemon entrando em treinamento. Força atual: %.2f. Qtd doces: %d. Nivel treinador: %d",
                pokemon.getForca(),
                pokemon.getDoces(),
                nivel
        )
        );
        Double forcaPokemon = pokemon.getForca();
        pokemon.setForca(forcaPokemon + (forcaPokemon * .1));
        pokemon.setDoces(pokemon.getDoces() + 10);
        nivel += 2;
        System.out.println(String.format("Pokemon treinado com sucesso. Força atual: %.2f. Qtd doces: %d. Nivel treinador: %d",
                pokemon.getForca(),
                pokemon.getDoces(),
                nivel
        )
        );
    }

    void evoluirPokemon(Pokemon pokemon, String nomeEvolucao) {
        if (pokemon.getDoces() < 50) {
            System.out.println("Não foi possível realizar operação");
        } else {
            System.out.println("Pókemon " + pokemon.getNome() + " evoluiu para ->" + nomeEvolucao);    
            pokemon.setNome(nomeEvolucao);
            pokemon.setDoces(pokemon.getDoces() - 50);
            nivel += 10;
        }
    }

}
