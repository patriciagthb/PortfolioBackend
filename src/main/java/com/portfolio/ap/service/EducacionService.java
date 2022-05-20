package com.portfolio.ap.service;

import com.portfolio.ap.entity.Educacion;
import com.portfolio.ap.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {

    @Autowired
    public EducacionRepository educacionRepo;

    @Override
    public void deleteEduc(int id) {
        educacionRepo.deleteById(id);
    }

    @Override
    public void updateEduc(Educacion educacion) {
        educacionRepo.save(educacion);
    }

    @Override
    public Educacion buscarEducById(int id) {
        return educacionRepo.findById(id).orElse(null);
    }

    @Override
    public void crearEduc(Educacion educacion) {
        educacionRepo.save(educacion);
    }

    @Override
    public List<Educacion> getEduc() {
        List<Educacion> listaEduc = educacionRepo.findAll();
        return listaEduc;
    }

}
