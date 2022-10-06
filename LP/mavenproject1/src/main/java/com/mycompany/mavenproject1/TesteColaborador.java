package com.mycompany.mavenproject1;

/**
 *
 * @author rafae
 */
public class TesteColaborador {

    public static void main(String[] args) {
        Colaborador colaborador1 = new Colaborador();
        colaborador1.setNome("Damasceno");
        colaborador1.setCargo("Estagiário");
        colaborador1.setSalario(2000.00);

        Colaborador colaborador2 = new Colaborador();
        colaborador2.setNome("Rafael");
        colaborador2.setCargo("Dev Sênior");
        colaborador2.setSalario(20000.00); // Muito mais que o Pobresceno HAHAHAHAHAHAHAHAHAhAHAHAH
        
        RecursosHumanos recursosHumanos = new RecursosHumanos();
        colaborador1.exibirInformacoes();
        colaborador2.exibirInformacoes();
        recursosHumanos.promoverColaborador(colaborador2, "Gestor", 30000.00);
        recursosHumanos.promoverColaborador(colaborador1, "Estagiário Sênior", 1000.00);
        recursosHumanos.reajustarSalario(colaborador1, 500.00);
        colaborador1.exibirInformacoes();
        colaborador2.exibirInformacoes();
        System.out.println("Quantidade de colaboradores promovidos: " + recursosHumanos.getQtdPromovidos());
        System.out.println("Quantidade de salarios reajustados: " + recursosHumanos.getQtdReajustes());

    }
}
