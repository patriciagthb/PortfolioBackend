package com.portfolio.ap.service;

import com.portfolio.ap.entity.AcercaDe;
import java.util.List;


public interface IAcercaDeService {
    
    public List <AcercaDe> getAcerca();
    
    public List<AcercaDe> verAcercaDe();
    
    public void crearAcercaDe(AcercaDe acerca);
    
    public void borrarAcercaDe(int id);
    
    public AcercaDe buscarAcercabyId(int id);
    
    public void updateAcerca(AcercaDe acerca);
    
}
