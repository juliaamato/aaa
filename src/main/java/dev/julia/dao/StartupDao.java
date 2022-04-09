package dev.julia.dao;
import java.util.ArrayList;
import java.util.List;

import dev.julia.entity.Startup;

public class StartupDao {
    public List<Startup> listStartup() {
        return Startup.listAll();
    } 

    public List<Startup> findStartupByLocalizacao(String localizacao) {
        return Startup.find("localizacao", localizacao).list();
    }

    public void createStartup(Startup startup){ 
        startup.setNome(startup.getNome());
        startup.setQtdFuncionarios(startup.getQtdFuncionarios());
        startup.setDescricao(startup.getDescricao());
        startup.setIndustria(startup.getIndustria());
        startup.setLocalizacao(startup.getLocalizacao());
        startup.setRank(startup.getRank());
        startup.setcategoria(startup.getCategoria());
        startup.persist();
    }

    public List<Startup> findByQtdFuncionario (int qtdFuncionarios){
        List<Startup> startups = Startup.listAll();
        List<Startup> result =  new ArrayList<Startup>();
        for (Startup startup : startups) {
            if(startup.getQtdFuncionarios() == qtdFuncionarios){
                result.add(startup);
            }
        }
        return result;
    }
    
    public Startup findById (Long id){
        List<Startup> startups = Startup.listAll();
        for (Startup startup : startups) {
            if(startup.id == id){
                return startup;
            }
        }
        return null;
    }
    

}
