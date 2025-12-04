package com.senai.crescer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.crescer.models.Produto;
import com.senai.crescer.repositories.ProdutoRepository;

@Service
public class ProdutoService {
    @Autowired
    public ProdutoRepository produtoRepository;

    //count
    public Long count() {
        return produtoRepository.count();
    }

    //findById
    public Produto findById(Integer id) {
        return produtoRepository.findById(id).get();
    }

    //findAll
    public List<Produto> listar(){
            return produtoRepository.findAll();
    }

    //save
    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }  

    //update
    public Produto save(Produto produto, Integer id) {
        Produto e = findById(id);
        if (e != null) {
            produto.setId(id);
            return produtoRepository.save(produto);
        }
        return null;
    }

    //delete
    public boolean delete(Integer id) {
        Produto produto = produtoRepository.findById(id).get();
        if(produto != null) {
            produtoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
