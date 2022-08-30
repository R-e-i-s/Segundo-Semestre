package com.bandtec.primeiro.projeto;

//Nome da classe sempre em padrão PascalCase
public class PrimeiraClasse {
    
    //Métodos em Java é o que chamavamos de Funções em JavaScript
    //Argumentos em Java é o que chamavamos de Parâmetros em JavaScript
    public static void main(String[] args) {
        
        // Observações gerais:
        // As cobrinhas amarelas na IDE são apenas alertas
        // Já as vermelhas são erros 
        // Rode o programa com atalho Shift + F6
        
        // Exibindo algo (equivalente ao console.log do JavaScript)
        System.out.println("Olá Mundo Java!");  
        
        // Nomes de variáveis usam o padrão camelCase
        // Declarando e inicializando a variável
        Integer numero = 10; 
        
        // Somente declarando
        Integer numeroTeste;
        
        // Somente inicializando
        numeroTeste = 42;
        
        // Jogando o valor de uma variável em outra variável
        numeroTeste = numero;
       
        // Exibindo e concactenando
        System.out.println("Qual é o número: " + numeroTeste);

        // Tipo Wrapper -> USAREMOS ESSE TODO SEMESTRE
        // É uma classe, logo possui métodos 
        // e esses métodos podem nos ajudar :)
        Boolean bloqueado;
                      
        // Tipo primitivo, sempre inicia com um valor
        // no caso do booleano false
        boolean bloqueadoPrimitivo;
      
    }
}
