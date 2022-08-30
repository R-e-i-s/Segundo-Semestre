package com.mycompany.lista3.rafael.reis.adsb;

/**
 *
 * @author rafael.reis ;)
 */
public class ClassificaIdadeMetodo {
        
    void ClassificarIdade (Integer idade) {
        
        String resposta;
        
        if (idade < 0) {
            resposta = "ERRO: Não é permitido idade menor que 0";
        } else if (idade <= 2) {
            resposta = "Bebe";
        } else if (idade <= 11) {
            resposta = "Criança";
        } else if (idade <= 19) {
            resposta = "Adolescente";
        } else if (idade <= 30) {
            resposta = "Jovem";
        } else if (idade <= 60) {
            resposta = "Adulto";
        } else {
            resposta = "Idoso";
        }
        System.out.println(resposta);
        
    }
    
}
