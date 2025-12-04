package com.senai.crescer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.crescer.models.Produto;
import com.senai.crescer.services.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    @Autowired
    public ProdutoService produtoService;

    //count
    @GetMapping("/count")
    public Long count() {
        return produtoService.count();
    }

    //findById
    @GetMapping("/find/{id}")
    public Produto find(@PathVariable Integer id) {
        return produtoService.findById(id);
    }

    //findAll
    @GetMapping("/list")
    public List<Produto> list() {
        return produtoService.listar();
    }

    //save
    @PostMapping("/salvar")
    public Produto salvar(@RequestBody Produto produto) {
        return produtoService.salvar(produto);
    }

    //update
    @PutMapping("/atualizar/{id}")
    public Produto save(@PathVariable Integer id, @RequestBody Produto produto){
        return produtoService.save(produto, id);
    }

    //delete
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        boolean deletou = produtoService.delete(id);
        if (deletou) {
            return "Produto excluido!";
        }
        return "Falha ao excluir produto.";
    }
}

