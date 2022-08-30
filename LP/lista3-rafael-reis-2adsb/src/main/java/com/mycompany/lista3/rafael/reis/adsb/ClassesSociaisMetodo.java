package com.mycompany.lista3.rafael.reis.adsb;

/**
 *
 * @author rafael.reis
 */
public class ClassesSociaisMetodo {

    Double calcQtdSalariosMin(Double renda) {
        
        return renda / 1100;
        
    }

    String identificarClasse(Double renda) {
        Double salarioMin = renda / 1100;
        if (salarioMin <= 2) {
            return "E";
        } else if (salarioMin <= 4) {
            return "D";
        } else if (salarioMin <= 10) {
            return "C";
        } else if (salarioMin <= 20) {
            return "B";
        } else {
            return "A";
        }
    }

}
