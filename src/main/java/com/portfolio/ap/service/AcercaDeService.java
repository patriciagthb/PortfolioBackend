package com.portfolio.ap.service;

import com.portfolio.ap.entity.AcercaDe;
import com.portfolio.ap.repository.AcercaDeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcercaDeService implements IAcercaDeService{

    @Autowired
    public AcercaDeRepository acercaRepo;
    
    @Override
    public List<AcercaDe> verAcercaDe() {
        return acercaRepo.findAll();
    }

    @Override
    public void crearAcercaDe(AcercaDe acerca) {
        acercaRepo.save(acerca);
    }

    @Override
    public void borrarAcercaDe(int id) {
        acercaRepo.deleteById(id);
    }

    @Override
    public AcercaDe buscarAcercabyId(int id) {
        AcercaDe acerca = acercaRepo.findById(id).orElse(null);
        return acerca;
    }

    @Override
    public void updateAcerca(AcercaDe acerca) {
       acercaRepo.save(acerca);
    }

    @Override
    public List<AcercaDe> getAcerca() {
    List<AcercaDe> listaAc = acercaRepo.findAll();
    return listaAc;    
    }


    
}
