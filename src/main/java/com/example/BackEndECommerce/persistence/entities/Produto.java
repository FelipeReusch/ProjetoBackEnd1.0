package com.example.BackEndECommerce.persistence.entities;

import javax.persistence.*;

@Entity
public class Produto {
    @Id
    @SequenceGenerator(name = "produto_sequencia", sequenceName = "produto_sequencia", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_sequencia")
    private Integer id;
    private String nome;
    private Double valor;
    private String descricao;
    private String console;
    private String imagem;
    private String sinopse;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Produto(){}

    public Produto(String nome, Double valor, String descricao, String console, String imagem, String sinopse, Categoria categoria) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.console = console;
        this.imagem = imagem;
        this.sinopse = sinopse;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getImagem() {
        return imagem;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
}
