package com.senai.crescer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.crescer.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
