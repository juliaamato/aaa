package dev.julia.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public List<Startup> findByQtdFuncionario (List<Startup> startups, int qtdFuncionarios){
        List <Startup> result =  new ArrayList<Startup>();
        System.out.println(qtdFuncionarios);
        System.out.println("aaaaaaaaaaa " + startups.size());
        for (Startup startup : startups) {
            System.out.println("for");
            if(startup.getQtdFuncionarios() == qtdFuncionarios){
                System.out.println("IF");
                result.add(startup);
            }
        }
        return result;
    }

}