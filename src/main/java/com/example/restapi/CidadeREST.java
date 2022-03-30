package com.example.restapi;

import java.util.List;

import com.example.restapi.database.RepositorioCidade;
import com.example.restapi.entidade.Cidade;

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
@RequestMapping("/cidade")
public class CidadeREST {
    @Autowired
    private RepositorioCidade repositorioCidade;

    // GET pesquisa com paginação
    @GetMapping
    public Page<Cidade> listar(Pageable page){
        return repositorioCidade.findAll(page);
    }   
    
    // GET número de registros
    @GetMapping(value = {"/registros"})
    private Long countRegistros(){
        return repositorioCidade.count();
    }   

    // GET buscar por estado(uf)
    @GetMapping(value = {"uf/{uf}"})
    public Page<Cidade> findByUF(@PathVariable String uf, Pageable pageable){
        return repositorioCidade.findByUf(uf, pageable);        
}

    //GET buscar por nome a partir de 3 caracteres
    @GetMapping(value = {"cidade/{cidade}"})    
    public Page<Cidade> findByCidade(@PathVariable String cidade, Pageable pageable){
        if(cidade.length() > 3) {
         return repositorioCidade.findByCidade(cidade, pageable);    
        }
        return null;    
    }

    // incluir
    @PostMapping
    public void salvar(@RequestBody Cidade cidade){
        repositorioCidade.save(cidade);
    }

    // alterar
    @PutMapping
    public void alterar(@RequestBody Cidade cidade){
        if(cidade.getIdCidade() > 0)
        repositorioCidade.save(cidade);
    }

    // deletar
    @DeleteMapping("/{idCidade}")
    public void excluir(@PathVariable Long idCidade){
        repositorioCidade.deleteById(idCidade);
    }
}
