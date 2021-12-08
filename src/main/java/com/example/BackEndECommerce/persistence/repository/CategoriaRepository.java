package com.example.BackEndECommerce.persistence.repository;

import com.example.BackEndECommerce.persistence.entities.Categoria;
import com.example.BackEndECommerce.persistence.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {
    @Query("select p from Produto p where p.categoria.nome = ?1")
    List<Produto> buscarProdutoCategoria(String categoria);
}
