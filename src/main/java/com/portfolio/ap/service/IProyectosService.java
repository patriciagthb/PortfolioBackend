package com.portfolio.ap.service;

import com.portfolio.ap.entity.Proyectos;
import java.util.List;

public interface IProyectosService {
    
   public List <Proyectos> getProy();
    
   public void crearProy(Proyectos proyectos);
    
   public void deleteProy(int id);
   
   public void updateProy(Proyectos proyectos);
   
   public Proyectos buscarProyById(int id);
    
}
