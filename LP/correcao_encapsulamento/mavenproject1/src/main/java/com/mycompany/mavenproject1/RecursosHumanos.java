package com.mycompany.mavenproject1;

/**
 *
 * @author rafae
 */
public class RecursosHumanos {

    private Integer totalPromovidos;
    private Integer totalReajustados;

    public RecursosHumanos() {
        this.totalPromovidos = 0;
        this.totalReajustados = 0;
    }
    
    public void reajustarSalario (Colaborador colaborador, Double reajuste) {
        if (reajuste <= 0) {
            System.out.println("ERRO: REAJUSTE MENOR OU IGUAL A 0");
        } else {
            System.out.println("SALARIO REAJUSTADO COM SUCESSO");
            colaborador.setSalario(colaborador.getSalario() + reajuste);
            totalReajustados ++;
        }
    }
    
    public void promoverColaborador (Colaborador colaborador, String novoCargo, Double novoSalario) {
        Double salarioAtual = colaborador.getSalario();
        if (salarioAtual >= novoSalario) {
            System.out.println("ERRO: NOVO SALARIO MENOR OU IGUAL AO SALARIO ATUAL");
        } else {
            colaborador.setCargo(novoCargo);
            colaborador.setSalario(novoSalario);
            System.out.println("COLABORADOR PROMOVIDO COM SUCESSO");
            totalPromovidos++;
        }
    }

    public Integer getTotaalPromovidos() {
        return totalPromovidos;
    }

    public Integer getTotaalReajustados() {
        return totalReajustados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RecursosHumanos{");
        sb.append("totalPromovidos=").append(totalPromovidos);
        sb.append(", totalReajustados=").append(totalReajustados);
        sb.append('}');
        return sb.toString();
    }
    
    

}
