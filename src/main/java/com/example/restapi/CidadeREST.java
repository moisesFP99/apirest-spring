package com.example.restapi;

import java.util.List;

import com.example.restapi.database.RepositorioCidade;
import com.example.restapi.entidade.Cidade;

import org.springframework.beans.factory.annotation.Autowired;

public class CidadeREST {
    @Autowired
    private RepositorioCidade repositorioCidade;

    public List<Cidade> listar(){
        return repositorioCidade.findAll();
    }

    public void salvar(Cidade cidade){
        repositorioCidade.save(cidade);
    }

    public void alterar(Cidade cidade){
        if(cidade.getIdCidade() > 0)
        repositorioCidade.save(cidade);
    }

    public void excluir(Cidade cidade){
        repositorioCidade.delete(cidade);
    }
}
