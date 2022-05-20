package com.portfolio.ap.service;

import com.portfolio.ap.entity.Habilidades;
import com.portfolio.ap.repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesService implements IHabilidadesService {
    
    @Autowired
    public HabilidadesRepository habRepo;

    @Override
    public void deleteHab(int id) {
        habRepo.deleteById(id);
    }

    @Override
    public void updateHab(Habilidades habilidades) {
        habRepo.save(habilidades);
    }

    @Override
    public Habilidades buscarHabById(int id) {
        return habRepo.findById(id).orElse(null);
    }

    @Override
    public void crearHab(Habilidades habilidades) {
        habRepo.save(habilidades);
    }

    @Override
    public List<Habilidades> getHab() {
    List<Habilidades> listaHab = habRepo.findAll();
        return listaHab;    
    }
}
