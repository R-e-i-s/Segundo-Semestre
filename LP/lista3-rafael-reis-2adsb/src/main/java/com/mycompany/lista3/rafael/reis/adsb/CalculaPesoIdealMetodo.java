/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3.rafael.reis.adsb;

/**
 *
 * @author rafael.reis
 */
public class CalculaPesoIdealMetodo {

    Double calculaPesoIdeal(String sexo, Double altura) {
        sexo = sexo.toUpperCase();
        Double pesoIdeal;
        if (sexo.equals("M")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else if (sexo.equals("F")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            pesoIdeal = 0.0;
        }
        return pesoIdeal;
    }

}
