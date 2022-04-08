package dev.julia.dao;
import java.util.List;

import dev.julia.entity.Startup;

public class StartupDao {
    public List<Startup> listStartup() {
        return Startup.listAll();
    } 
    
}
