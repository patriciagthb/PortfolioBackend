package com.portfolio.ap.service;

import com.portfolio.ap.entity.Experiencia;
import com.portfolio.ap.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {

    @Autowired
    public ExperienciaRepository expRepo;

    @Override
    public void deleteExp(int id) {
        expRepo.deleteById(id);
    }

    @Override
    public void updateExp(Experiencia experiencia) {
        expRepo.save(experiencia);
    }

    @Override
    public Experiencia buscarExpById(int id) {
        return expRepo.findById(id).orElse(null);
    }

    @Override
    public void crearExp(Experiencia experiencia) {
        expRepo.save(experiencia);
    }

    @Override
    public List<Experiencia> getExp() {
        List<Experiencia> listaExp = expRepo.findAll();
        return listaExp;
    }
}
