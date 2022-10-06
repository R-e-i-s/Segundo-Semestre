package com.mycompany.banco.de.dados.testes;

import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author rafae
 */
public class TesteBanco {

    public static void main(String[] args) {
        Connection connection = new Connection();
        JdbcTemplate database = connection.getConnection();

        List<Filme> listaFilmes
                = database.query("SELECT * FROM filme",
                        new BeanPropertyRowMapper<>(Filme.class)
                );
        for (Filme filme : listaFilmes) {
            if (filme.getAnoLancamento() == 2022) {
                System.out.println(filme.toString());
            }
        }
        
        // Buscar filmes de 2005 
        List<Filme> listaFilmesNomeGaldino
                = database.query(
                        "SELECT * FROM filme WHERE NOME = 'Galdino e os Amigos'",
                        new BeanPropertyRowMapper<>(Filme.class));
        System.out.println(listaFilmesNomeGaldino);
    }
}
