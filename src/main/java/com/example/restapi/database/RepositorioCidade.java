package com.example.restapi.database;

import com.example.restapi.entidade.Cidade;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCidade extends JpaRepository<Cidade,Long>{
    
}
