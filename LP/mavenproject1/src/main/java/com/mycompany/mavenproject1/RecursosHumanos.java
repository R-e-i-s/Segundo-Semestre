package com.mycompany.mavenproject1;

/**
 *
 * @author rafae
 */
public class RecursosHumanos {

    private Integer qtdPromovidos = 0;
    private Integer qtdReajustes = 0;

    public Integer getQtdPromovidos() {
        return qtdPromovidos;
    }

    public Integer getQtdReajustes() {
        return qtdReajustes;
    }

    void reajustarSalario(Colaborador colaborador, Double valorReajustado) {
        if (valorReajustado >= 0) {
            colaborador.setSalario(valorReajustado + colaborador.getSalario());
            qtdReajustes++;
            System.out.println("Valor reajustado");
        }
    }

    void promoverColaborador(Colaborador colaborador, String cargo, Double novoSalario) {
        Double salarioAtual = colaborador.getSalario();
        if (novoSalario > salarioAtual) {
            colaborador.setCargo(cargo);
            colaborador.setSalario(novoSalario);
            qtdPromovidos++;
            System.out.println("Promovido");
        } else {
            System.out.println("ERRO: SALARIO A SER DADO MENOR OU IGUAL AO SALÁRIO ATUAL");
        }
    }
}
