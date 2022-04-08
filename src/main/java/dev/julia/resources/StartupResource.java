package dev.julia.resources;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dev.julia.controller.StartupController;
import dev.julia.entity.*;

import javax.ws.rs.Consumes;




@Path("/startup")
public class StartupResource {
    StartupController startupController = new StartupController();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Startup> listStartup() {
        List<Startup> startups = startupController.listStartup();
        return startups;
    } 

    @Path("/filtrolocal")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.TEXT_PLAIN)
    public List<Startup> findStartupByLocalizacao(@HeaderParam("localizacao") String localizacao) {
        List<Startup> startups = startupController.findStartupByLocalizacao(localizacao);
        return startups;
    }

    @Path("/filtrofuncionarios")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.TEXT_PLAIN)
    public List<Startup> findStartupByFuncionarios(@HeaderParam("qtdFuncionarios") String  qtdFuncionarios) {
        return startupController.findByQtdFuncionario(Integer.parseInt(qtdFuncionarios));
    }

    @Path("/filtroid")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.TEXT_PLAIN)
    public Startup searchStartupById(@HeaderParam("id") String id) {
        return startupController.findById(Long.parseLong(id));
    }

    

    @Path("/add")
    @POST
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void createStartup(Startup startup) {
        startupController.createStartup(startup);
    }  
}
