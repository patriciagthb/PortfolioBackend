package com.portfolio.ap.service;

import com.portfolio.ap.entity.Proyectos;
import com.portfolio.ap.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService {
    
    @Autowired
    public ProyectosRepository proyRepo;

    @Override
    public void deleteProy(int id) {
        proyRepo.deleteById(id);
    }

    @Override
    public void updateProy(Proyectos proyectos) {
        proyRepo.save(proyectos);
    }

    @Override
    public Proyectos buscarProyById(int id) {
        return proyRepo.findById(id).orElse(null);
    }

    @Override
    public void crearProy(Proyectos proyectos) {
        proyRepo.save(proyectos);
    }

    @Override
    public List<Proyectos> getProy() {
        List<Proyectos> listaProy = proyRepo.findAll();
        return listaProy;
    } 
        
}
