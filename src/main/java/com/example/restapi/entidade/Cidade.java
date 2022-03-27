package com.example.restapi.entidade;

import javax.persistence.Entity;

@Entity
public class Cidade {
    private Long idCidade;
    private Long idEstado;
    private String cidade;
    
    public Long getIdCidade() {
        return idCidade;
    }
    public void setIdCidade(Long idCidade) {
        this.idCidade = idCidade;
    }
    public Long getIdEstado() {
        return idEstado;
    }
    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    
}
