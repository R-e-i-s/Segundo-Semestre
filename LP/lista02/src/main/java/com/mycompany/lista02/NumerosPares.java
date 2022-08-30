/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02;

/**
 *
 * @author rafael.reis
 */
public class NumerosPares {

    public static void main(String[] args) {
        Integer index = 0;
        while (index <= 40) {            
            if (index % 2 == 0) {
                System.out.println(index);
            }
            index++;
        }
        
    }
}
