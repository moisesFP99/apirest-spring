package com.example.restapi;

import java.util.List;

import com.example.restapi.database.RepositorioEstado;
import com.example.restapi.entidade.Estado;

import org.springframework.beans.factory.annotation.Autowired;

public class EstadoREST {
    @Autowired
    private RepositorioEstado repositorioEstado;

    public List<Estado> listar(){
        return repositorioEstado.findAll();
    }

    public void salvar(Estado estado){
        repositorioEstado.save(estado);
    }

    public void alterar(Estado estado){
        if(estado.getIdEstado() > 0)
        repositorioEstado.save(estado);
    }

    public void excluir(Estado estado){
        repositorioEstado.delete(estado);
    }
}
