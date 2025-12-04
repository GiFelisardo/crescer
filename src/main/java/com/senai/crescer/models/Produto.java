package com.senai.crescer.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="descricao")
    private String descricao;

    @Column(name="valor")
    private double valor;

    @Column(name="avaliacao")
    private String avaliacao;

    @Column(name="carrinho")
    private boolean carrinho;

    @Column(name="estoque")
    private String estoque;

    public Produto() {
    }

    public Produto(String avaliacao, boolean carrinho, String descricao, String estoque, Integer id, String nome, double valor) {
        this.avaliacao = avaliacao;
        this.carrinho = carrinho;
        this.descricao = descricao;
        this.estoque = estoque;
        this.id = id;
        this.nome = nome;
        this.valor = valor;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public boolean isCarrinho() {
        return carrinho;
    }

    public void setCarrinho(boolean carrinho) {
        this.carrinho = carrinho;
    }

    public String getEstoque() {
        return estoque;
    }

    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }


}
