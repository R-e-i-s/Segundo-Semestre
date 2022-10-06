package com.sptech.atividade.com.testes;

/**
 *
 * @author rafae
 */
public class Medico {

    private Integer id;
    private String nome;
    private String especialidade;
    private Boolean ativo;
    private Double salario;

    public Medico(Integer id, String nome, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
        this.ativo = true;
        this.salario = 0.00;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Medico{");
        sb.append("id=").append(id);
        sb.append(", nome=").append(nome);
        sb.append(", especialidade=").append(especialidade);
        sb.append(", ativo=").append(ativo);
        sb.append(", salario=").append(salario);
        sb.append('}');
        return sb.toString();
    }

}
