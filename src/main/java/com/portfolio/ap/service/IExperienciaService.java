package com.portfolio.ap.service;

import com.portfolio.ap.entity.Experiencia;
import java.util.List;

public interface IExperienciaService {
    
    public List <Experiencia> getExp();
    
    public void crearExp(Experiencia experiencia);
    
    public void deleteExp(int id);
    
    public void updateExp(Experiencia experiencia);
    
    public Experiencia buscarExpById(int id);
    
}
