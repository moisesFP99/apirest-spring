package com.example.restapi.database;

import java.util.List;

import com.example.restapi.entidade.Estado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RepositorioEstado extends JpaRepository<Estado,Long>{
    @Query(nativeQuery = true, value = "SELECT COUNT(*) FROM estado")
    List<Estado> countRegistros(String estado);
}
