package com.example.BackEndECommerce.controller;

import com.example.BackEndECommerce.persistence.entities.Produto;
import com.example.BackEndECommerce.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class gitProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping
    public List<Produto> getProdutos(){
        return service.listarProdutos();
    }

    @GetMapping("/{id}")
    public Produto getProdutoId(@PathVariable Integer id){
        return service.buscarProdutoId(id);
    }

    @GetMapping("console/{console}")
    public List<Produto> getProdutoConsole(@PathVariable String console){
        return service.consoleProduto(console);
    }
}
