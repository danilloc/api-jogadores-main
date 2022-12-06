package com.projectapi.apicopa.model;

import javax.persistence.*;

@Entity
@Table(name = "Jogadores")
public class JogadorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    String nome;
    @Column
    String posicao;
    @Column
    private int numeroCamisa;

    public JogadorModel(){

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

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }
}
