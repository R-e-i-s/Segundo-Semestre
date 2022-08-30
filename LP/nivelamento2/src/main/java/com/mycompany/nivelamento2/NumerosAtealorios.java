package com.mycompany.nivelamento2;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author rafael.reis
 */
public class NumerosAtealorios {
    public static void main(String[] args) {
        
        
        Integer intAleatorio = ThreadLocalRandom.current().nextInt(0, 100);
        System.out.println(intAleatorio);
        
        Double dblAleatorio = ThreadLocalRandom.current().nextDouble(0, 100);
        System.out.println(dblAleatorio);
        
        Integer decimalPlace = 7;
        
        Double n = dblAleatorio * Math.pow(10, decimalPlace);
        n = Math.floor(n);
        n = n/Math.pow(10, decimalPlace);
        System.out.println(n);
        
    }
}
