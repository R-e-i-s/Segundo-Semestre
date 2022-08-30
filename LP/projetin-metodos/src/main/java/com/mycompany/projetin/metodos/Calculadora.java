package com.mycompany.projetin.metodos;

public class Calculadora {

    
    
//    Método sobrecarregado
//    Método faz mais de uma coisa
    Double somar() {
        return 10.0 + 10.0;
    }
    Double somar(Double a, Double b) {
        return a + b;
    }
    Boolean isPar (Double a) {
        return a % 2 == 0;
    }
    Boolean isPrimo (Integer a) {
        Boolean isPrimo;
        Integer contador = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            isPrimo = true;
        } else {
            isPrimo = false;
        }
        return isPrimo;
    }

}
