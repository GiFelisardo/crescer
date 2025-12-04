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

import com.senai.crescer.models.Endereco;
import com.senai.crescer.services.EnderecoService;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
    @Autowired
    public EnderecoService enderecoService;

    //count
    @GetMapping("/count")
    public Long count() {
        return enderecoService.count();
    }

    //findById
    @GetMapping("/find/{id}")
    public Endereco find(@PathVariable Integer id) {
        return enderecoService.findById(id);
    }

    //findAll
    @GetMapping("/list")
    public List<Endereco> list() {
        return enderecoService.listar();
    }

    //save
    @PostMapping("/salvar")
    public Endereco salvar(@RequestBody Endereco endereco) {
        return enderecoService.salvar(endereco);
    }

    //update
    @PutMapping("/atualizar/{id}")
    public Endereco save(@PathVariable Integer id, @RequestBody Endereco endereco){
        return enderecoService.save(endereco, id);
    }

    //delete
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        boolean deletou = enderecoService.delete(id);
        if (deletou) {
            return "Endereço excluido!";
        }
        return "Falha ao excluir endereço.";
    }
}
