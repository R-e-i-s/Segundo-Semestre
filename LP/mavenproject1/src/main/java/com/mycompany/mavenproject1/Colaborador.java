package com.mycompany.mavenproject1;

/**
 *
 * @author rafae
 */
public class Colaborador {

    private String nome;
    private String cargo;
    private Double salario;

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    void exibirInformacoes() {
        System.out.println(
                String.format(
                        "------------------------\n"
                        + "Nome: %s\n"
                        + "Cargo: %s\n"
                        + "Salario: %.2f\n"
                        + "--------------------------",
                        nome, cargo, salario
                )
        );
    }

}
