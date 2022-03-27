package com.example.restapi;

import java.util.List;

import com.example.restapi.database.RepositorioEstado;
import com.example.restapi.entidade.Estado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estado")
public class EstadoREST {
    @Autowired
    private RepositorioEstado repositorioEstado;

    @GetMapping
    public List<Estado> listar(){
        return repositorioEstado.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Estado estado){
        repositorioEstado.save(estado);
    }

    @PutMapping
    public void alterar(@RequestBody Estado estado){
        if(estado.getIdEstado() > 0)
        repositorioEstado.save(estado);
    }

    @DeleteMapping
    public void excluir(@RequestBody Estado estado){
        repositorioEstado.delete(estado);
    }
}
