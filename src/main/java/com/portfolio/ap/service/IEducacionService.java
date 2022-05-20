package com.portfolio.ap.service;

import com.portfolio.ap.entity.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public List <Educacion> getEduc();
    
    public void crearEduc(Educacion educacion);
    
    public void deleteEduc(int id);
    
    public void updateEduc(Educacion educacion);
    
    public Educacion buscarEducById(int id);   
    
    
}
