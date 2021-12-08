package com.example.BackEndECommerce.persistence.repository;

import com.example.BackEndECommerce.persistence.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Integer> {
    @Query("select p from Produto p where p.console = ?1")
    List<Produto> buscarProdutoPorConsole(String console);
}
