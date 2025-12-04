package com.senai.crescer.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="logradouro")
    private String logradouro;

    @Column(name="localidade")
    private String localidade;

    @Column(name="CEP")
    private String CEP;

    @Column(name="numero")
    private String numero;

    @Column(name="complemento")
    private String complemento;

    @Column(name="bairro")
    private String bairro;

    @Column(name="referencia")
    private String referencia;

    public Endereco() {
    }

    public Endereco(Integer id, String logradouro, String localidade, String cEP, String numero, String complemento,
            String bairro, String referencia) {
        this.id = id;
        this.logradouro = logradouro;
        this.localidade = localidade;
        CEP = cEP;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.referencia = referencia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

}
