package com.portfolio.ap.service;

import com.portfolio.ap.entity.Encabezado;
import com.portfolio.ap.repository.EncabezadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EncabezadoService implements IEncabezadoService{
    
    @Autowired
    public EncabezadoRepository encabezadoRepo;       

    @Override
    public void deleteEnc(int id) {
        encabezadoRepo.deleteById(id);
    }

    @Override
    public void updateEnc(Encabezado encabezado) {
        encabezadoRepo.save(encabezado);
    }

    @Override
    public Encabezado buscarEncById(int id) {
        return encabezadoRepo.findById(id).orElse(null);
    }

    @Override
    public void crearEnc(Encabezado encabezado) {
        encabezadoRepo.save(encabezado);
    }

    @Override
    public List<Encabezado> getEnc() {
        List<Encabezado> listaEnc = encabezadoRepo.findAll();
        return listaEnc;
    }
    
}
