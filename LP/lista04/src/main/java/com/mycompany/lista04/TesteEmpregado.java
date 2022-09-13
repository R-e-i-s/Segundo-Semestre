package com.mycompany.lista04;

/**
 *
 * @author rafae
 */
public class TesteEmpregado {

    public static void main(String[] args) {
        Empregado empregado1 = new Empregado();
        empregado1.nome = "João";
        empregado1.cargo = "Analista de Sistemas";
        empregado1.salario = 5400.00;

        Empregado empregado2 = new Empregado();
        empregado2.nome = "Rafael";
        empregado2.cargo = "Desenvolvedor Mobile";
        empregado2.salario = 3100.00;

        System.out.println(
                "Nome: " + empregado1.nome
                + "\nCargo: " + empregado1.cargo
                + "\nSalario: " + empregado1.salario
        );
        empregado1.reajustarSalario(15.0);
        System.out.println(
                "Nome: " + empregado1.nome
                + "\nCargo: " + empregado1.cargo
                + "\nSalario: " + empregado1.salario
        );
        System.out.println(
                "Nome: " + empregado2.nome
                + "\nCargo: " + empregado2.cargo
                + "\nSalario: " + empregado2.salario
        );
        empregado2.reajustarSalario(25.0);
        System.out.println(
                "Nome: " + empregado2.nome
                + "\nCargo: " + empregado2.cargo
                + "\nSalario: " + empregado2.salario
        );
    }
}
