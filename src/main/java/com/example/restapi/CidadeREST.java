package com.example.restapi;

import java.util.List;

import com.example.restapi.database.RepositorioCidade;
import com.example.restapi.entidade.Cidade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cidade")
public class CidadeREST {
    @Autowired
    private RepositorioCidade repositorioCidade;

    @GetMapping
    public List<Cidade> listar(){
        return repositorioCidade.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Cidade cidade){
        repositorioCidade.save(cidade);
    }

    @PutMapping
    public void alterar(@RequestBody Cidade cidade){
        if(cidade.getIdCidade() > 0)
        repositorioCidade.save(cidade);
    }

    @DeleteMapping
    public void excluir(@RequestBody Cidade cidade){
        repositorioCidade.delete(cidade);
    }
}
