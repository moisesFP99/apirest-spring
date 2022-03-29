package com.example.restapi.database;

import java.util.List;

import com.example.restapi.entidade.Cidade;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RepositorioCidade extends JpaRepository<Cidade,Long>{
    @Query(nativeQuery= true, value="SELECT * FROM cidade WHERE uf = ?")
    List<Cidade> findByUF(String uf);
    @Query(nativeQuery= true, value="SELECT * FROM cidade WHERE cidade = ?")
    List<Cidade> findByNome(String nome);
    @Query(nativeQuery= true, value="SELECT COUNT(*) FROM cidade")
    List<Cidade> countRegistros(String cidade);
}
