package com.example.BackEndECommerce.service;

import com.example.BackEndECommerce.persistence.entities.Produto;
import com.example.BackEndECommerce.persistence.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<Produto> listarProdutos(){
        return repository.findAll();
    }

    public Produto buscarProdutoId(Integer id){
        return repository.findById(id).get();
    }

    public List<Produto> consoleProduto(String console){
        return repository.buscarProdutoPorConsole(console);
    }
}
