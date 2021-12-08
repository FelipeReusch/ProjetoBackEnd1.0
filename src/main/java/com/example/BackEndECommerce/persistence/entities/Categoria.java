package com.example.BackEndECommerce.persistence.entities;

import javax.persistence.*;

@Entity
public class Categoria {

    @Id
    @SequenceGenerator(name = "categoria_sequencia", sequenceName = "categoria_sequencia", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categoria_sequencia")
    private Integer id;
    private String nome;

    public Categoria(){}
    public Categoria(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
