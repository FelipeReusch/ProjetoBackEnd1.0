package com.example.BackEndECommerce.controller;

import com.example.BackEndECommerce.persistence.entities.Categoria;
import com.example.BackEndECommerce.persistence.entities.Produto;
import com.example.BackEndECommerce.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @GetMapping
    public List<Categoria> getCategoria(){
        return service.listarCategorias();
    }

    @GetMapping("{categoria}")
    public List<Produto> getProdutoCategoria(@PathVariable String categoria){
        return service.listarProdutoPorCategoria(categoria);
    }
}
