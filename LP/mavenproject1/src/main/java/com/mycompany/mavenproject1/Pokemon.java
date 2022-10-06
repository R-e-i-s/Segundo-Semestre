package com.mycompany.mavenproject1;

/**
 *
 * @author rafae
 */
public class Pokemon {

    private String nome;
    private String tipo;
    private Double forca;
    private Integer doces = 0;

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getForca() {
        return forca;
    }

    public Integer getDoces() {
        return doces;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public void setDoces(Integer doces) {
        this.doces = doces;
    }

}
