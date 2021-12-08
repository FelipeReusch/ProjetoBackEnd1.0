package com.example.BackEndECommerce.service;

import com.example.BackEndECommerce.persistence.entities.Categoria;
import com.example.BackEndECommerce.persistence.entities.Produto;
import com.example.BackEndECommerce.persistence.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public List<Categoria> listarCategorias(){
        return repository.findAll();
    }

    public List<Produto> listarProdutoPorCategoria(String categoria){
        return repository.buscarProdutoCategoria(categoria);
    }
}
