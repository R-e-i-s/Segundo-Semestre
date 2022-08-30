package com.mycompany.lista3.rafael.reis.adsb;

public class VerificarPrimosMetodo {
    
    Boolean verificarPrimo (Integer aPrimo) {
        Boolean isPrimo;
        Integer contador = 0;
        for (int i = 1; i <= aPrimo; i++) {
            if (aPrimo % i == 0) {
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
