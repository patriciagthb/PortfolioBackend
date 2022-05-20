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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/habilidades")
public class HabilidadesController {

    @Autowired
    private IHabilidadesService habServ;

    @GetMapping("/get/hab")
    public List<Habilidades> getEnc() {
        return habServ.getHab();
    }

    @PostMapping("/new/hab")
    public void crearHab(@RequestBody Habilidades habilidades) {
        habServ.crearHab(habilidades);
    }

    @DeleteMapping("/delete/hab/{id}")
    public void deleteHab(@PathVariable int id) {
        habServ.deleteHab(id);
    }

    @PutMapping("/update/hab/{id}")
    public void updateHab(@PathVariable int id,
            @RequestParam("nombre") String nombre,
            @RequestParam("porcentaje") int porcentaje) {
        Habilidades habilidades = habServ.buscarHabById(id);

        habilidades.setNombre(nombre);
        habilidades.setPorcentaje(porcentaje);

        habServ.updateHab(habilidades);
    }

}
