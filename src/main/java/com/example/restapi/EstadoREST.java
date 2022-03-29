package com.example.restapi;

import java.util.List;

import com.example.restapi.database.RepositorioEstado;
import com.example.restapi.entidade.Estado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    // GET pesquisa com paginação
    @GetMapping
    public Page<Estado> listar(Pageable page){
        return repositorioEstado.findAll(page);
    }

    //GET número de registros
    @GetMapping(value = {"/registros"})
    private Long countRegistros(){
        return repositorioEstado.count();
    }

    // incluir
    @PostMapping
    public void salvar(@RequestBody Estado estado){
        repositorioEstado.save(estado);
    }

    // alterar
    @PutMapping
    public void alterar(@RequestBody Estado estado){
        if(estado.getIdEstado() > 0)
        repositorioEstado.save(estado);
    }

    // deletar
    @DeleteMapping("/{idEstado}")
    public void excluir(@PathVariable Long idEstado){
        repositorioEstado.deleteById(idEstado);
    }
}
