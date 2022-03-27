package com.example.restapi.database;

import com.example.restapi.entidade.Estado;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioEstado extends JpaRepository<Estado,Long>{
    
}
