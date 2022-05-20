package com.portfolio.ap.service;

import com.portfolio.ap.entity.Encabezado;
import java.util.List;



public interface IEncabezadoService {
    
    public List <Encabezado> getEnc();
    
    public void crearEnc(Encabezado encabezado);
    
    public void deleteEnc(int id);
    
    public void updateEnc(Encabezado encabezado);
    
    public Encabezado buscarEncById(int id);
    
}
