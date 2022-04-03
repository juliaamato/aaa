package dev.julia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Startup extends PanacheEntity{
       
    private String nome;
    
    private int qtdFuncionarios;
    
    private String industria;
    
    private String localizacao;
    
    private String descricao;
    
    private int rankk;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdFuncionarios() {
        return qtdFuncionarios;
    }

    public void setQtdFuncionarios(int qtdFuncionarios) {
        this.qtdFuncionarios = qtdFuncionarios;
    }

    public String getIndustria() {
        return industria;
    }

    public void setIndustria(String industria) {
        this.industria = industria;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getRank() {
        return rankk;
    }

    public void setRank(int rank) {
        this.rankk = rank;
    }

    public static Object find(String string, int parseInt) {
        return null;
    }

    public static Object find(String string, int parseInt) {
        return null;
    }
    
    
}
