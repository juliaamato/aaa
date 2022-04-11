package dev.julia.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import dev.julia.dao.StartupDao;
import dev.julia.entity.Startup;

public class StartupController {
    StartupDao startupDao = new StartupDao();

    public List<Startup> listStartup() {
        List<Startup> startups = startupDao.listStartup();
        System.out.println("aaaaaaaaaa + " +startups.size());
        return startups;
    } 

    public List<Startup> findStartupByLocalizacao(String localizacao) {
        List<Startup> startups = startupDao.findStartupByLocalizacao(localizacao);
        return startups;
    }

    public void createStartup (Startup startup){
        startupDao.createStartup(startup);
    }

   public List<Startup> findByQtdFuncionario(Integer qtdFuncionarios){
        return startupDao.findByQtdFuncionario(qtdFuncionarios);
    }

    public Startup findById(Long qtdFuncionarios){
        return startupDao.findById(qtdFuncionarios);
    }

    

}