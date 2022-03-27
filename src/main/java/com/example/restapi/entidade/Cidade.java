package com.example.restapi.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCidade;  
    @Column(nullable = false)
    private String cidade;
    @Column(nullable = false)
    
    public Long getIdCidade() {
        return idCidade;
    }
    public void setIdCidade(Long idCidade) {
        this.idCidade = idCidade;
    }    
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    
}
