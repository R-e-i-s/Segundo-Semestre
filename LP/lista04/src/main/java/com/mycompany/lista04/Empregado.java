package com.mycompany.lista04;

/**
 *
 * @author rafae
 */
public class Empregado {
    String nome;
    String cargo;
    Double salario;
    
    void reajustarSalario (Double valorReajuste) {
        salario = salario + (salario * (valorReajuste / 100));
        System.out.println(String.format("Novo salário: %.2f", salario));
    }
}
