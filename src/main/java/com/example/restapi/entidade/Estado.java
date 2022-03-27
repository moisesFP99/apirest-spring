package com.example.restapi.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String uf;

    public Long getIdEstado() {
        return idEstado;
    }
    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }

    
}
