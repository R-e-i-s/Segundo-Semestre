/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista07;

/**
 *
 * @author rafae
 */
public class Medicamento {

    private Integer id;
    private String nomeMedicamento;
    private Integer qtdEstoque;
    private Double valorVenda;

    public Medicamento(Integer id, String nomeMedicamento, Integer qtdEstoque, Double valorVenda) {
        this.id = id;
        this.nomeMedicamento = nomeMedicamento;
        this.qtdEstoque = qtdEstoque;
        this.valorVenda = valorVenda;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeMedicamento() {
        return nomeMedicamento;
    }

    public void setNomeMedicamento(String nomeMedicamento) {
        this.nomeMedicamento = nomeMedicamento;
    }

    public Integer getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(Integer qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    @Override
    public String toString() {
        return String.format("\nID: %d\nNome: %s\nQuantidade em estoque: %d\nValor: R$%.2f", id, nomeMedicamento, qtdEstoque, valorVenda);
    }

}
