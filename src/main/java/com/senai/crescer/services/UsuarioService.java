package com.senai.crescer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.crescer.models.Usuario;
import com.senai.crescer.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    public UsuarioRepository usuarioRepository;

    //count
    public Long count() {
        return usuarioRepository.count();
    }

    //findById
    public Usuario findById(Integer id) {
        return usuarioRepository.findById(id).get();
    }

    //findAll
    public List<Usuario> listar(){
            return usuarioRepository.findAll();
    }

    //save
    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }  

    //update
    public Usuario save(Usuario usuario, Integer id) {
        Usuario e = findById(id);
        if (e != null) {
            usuario.setId(id);
            return usuarioRepository.save(usuario);
        }
        return null;
    }

    //delete
    public boolean delete(Integer id) {
        Usuario usuario = usuarioRepository.findById(id).get();
        if(usuario != null) {
            usuarioRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
