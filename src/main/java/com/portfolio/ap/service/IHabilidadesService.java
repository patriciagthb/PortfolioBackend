package com.portfolio.ap.service;

import com.portfolio.ap.entity.Habilidades;
import java.util.List;


public interface IHabilidadesService {
    
    public List <Habilidades> getHab();
    
    public void crearHab(Habilidades habilidades);
    
    public void deleteHab(int id);
    
    public void updateHab(Habilidades habilidades);
    
    public Habilidades buscarHabById(int id);
    
}
