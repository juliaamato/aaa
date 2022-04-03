package dev.julia.resources;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dev.julia.controller.StartupController;
import dev.julia.entity.*;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.ws.rs.Consumes;

import javax.ws.rs.core.Response;


@Path("/startup")
public class StartupResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Startup> listStartup() {
        System.out.println("gettttt pegouuu");
        return Startup.listAll();
    }

    @Path("/filtrolocal")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.TEXT_PLAIN)
    public List<Startup> searchStartupByLocalizacao(String localizacao) {
        System.out.println("searchStartup pegouuu");
        return Startup.find("localizacao", localizacao).list();
    }

    // @Path("/filtrofuncionarios")
    // @PUT
    // @Produces(MediaType.APPLICATION_JSON)
    // @Consumes(MediaType.TEXT_PLAIN)
    // public List<Startup> searchStartupByFuncionarios(String qtdFuncionarios) {
    //     System.out.println("qtdddd pegouuu");
    //     return Startup.find ("qtdFuncionarios", Integer.parseInt(qtdFuncionarios)).list();
    // }


    @Path("/add")
    @POST
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void createStartup(Startup startup) {
        System.out.println("funcionou o post tb");
        StartupController startupController = new StartupController();
        startupController.create(startup);
    }  
}
