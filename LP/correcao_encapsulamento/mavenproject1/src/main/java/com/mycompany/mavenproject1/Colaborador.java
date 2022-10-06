package com.mycompany.mavenproject1;

/**
 *
 * @author rafae
 */
public class Colaborador {

    private String nome;
    private String cargo;
    private Double salario;

    public Colaborador(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nColaborador{").append("\n");
        sb.append("nome: ").append(nome).append(",\n");
        sb.append("cargo: ").append(cargo).append(",\n");
        sb.append("salario: ").append(salario).append(",\n");
        sb.append('}');
        return sb.toString();
    }

}
