package dev.julia.controller;

import dev.julia.entity.Startup;

public class StartupController {

    public void create (Startup startup){
        System.out.println("Controller" + startup.getNome());     
        startup.setNome(startup.getNome());
        startup.setQtdFuncionarios(startup.getQtdFuncionarios());
        startup.setDescricao(startup.getDescricao());
        startup.setIndustria(startup.getIndustria());
        startup.setLocalizacao(startup.getLocalizacao());
        startup.setRank(startup.getRank());
        startup.persist();
    }

}