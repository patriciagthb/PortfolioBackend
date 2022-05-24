package com.portfolio.ap.controller;

import com.portfolio.ap.entity.Habilidades;
import com.portfolio.ap.service.IHabilidadesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class HabilidadesController {

    @Autowired
    private IHabilidadesService habServ;

    @GetMapping("/habilidades/get")
    public List<Habilidades> getEnc() {
        return habServ.getHab();
    }

    @PostMapping("/habilidades/new")
    public void crearHab(@RequestBody Habilidades habilidades) {
        habServ.crearHab(habilidades);
    }

    @DeleteMapping("/habilidades/delete/{id}")
    public void deleteHab(@PathVariable int id) {
        habServ.deleteHab(id);
    }

    @PutMapping("/habilidades/update/{id}")
    public void updateHab(@PathVariable int id, @RequestBody Habilidades habilidades) {

        Habilidades nuevaHab = habServ.buscarHabById(id);
        nuevaHab.setNombre(habilidades.getNombre());
        nuevaHab.setPorcentaje(habilidades.getPorcentaje());

        habServ.updateHab(nuevaHab);
    }

    @GetMapping("/habilidades/findById/{id}")
    public Habilidades buscarHabById(@PathVariable int id) {
        return habServ.buscarHabById(id);
    }

}
