package com.senai.crescer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.crescer.models.Endereco;
import com.senai.crescer.repositories.EnderecoRepository;

@Service
public class EnderecoService {
    @Autowired
    public EnderecoRepository enderecoRepository;

    //count
    public Long count() {
        return enderecoRepository.count();
    }

    //findById
    public Endereco findById(Integer id) {
        return enderecoRepository.findById(id).get();
    }

    //findAll
    public List<Endereco> listar(){
            return enderecoRepository.findAll();
    }

    //save
    public Endereco salvar(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }  

    //update
    public Endereco save(Endereco endereco, Integer id) {
        Endereco e = findById(id);
        if (e != null) {
            endereco.setId(id);
            return enderecoRepository.save(endereco);
        }
        return null;
    }

    //delete
    public boolean delete(Integer id) {
        Endereco endereco = enderecoRepository.findById(id).get();
        if(endereco != null) {
            enderecoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
