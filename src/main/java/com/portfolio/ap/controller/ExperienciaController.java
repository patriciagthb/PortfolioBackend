package com.portfolio.ap.controller;

import com.portfolio.ap.entity.Experiencia;
import com.portfolio.ap.service.IExperienciaService;
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
@RequestMapping("/api/experiencia")
public class ExperienciaController {

    @Autowired
    private IExperienciaService expServ;

    @GetMapping("/get/exp")
    public List<Experiencia> getEnc() {
        return expServ.getExp();
    }

    @PostMapping("/new")
    public void crearExp(@RequestBody Experiencia experiencia) {
        expServ.crearExp(experiencia);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteExp(@PathVariable int id) {
        expServ.deleteExp(id);
    }

    @PutMapping("/update/{id}")
    public void updateExp(@PathVariable int id, @RequestBody Experiencia exp){
        
        Experiencia nuevaExp= expServ.buscarExpById(id);
        nuevaExp.setEmpresa(exp.getEmpresa());
        nuevaExp.setPuesto(exp.getPuesto());
        nuevaExp.setDesde(exp.getDesde());
        nuevaExp.setHasta(exp.getHasta());
        nuevaExp.setUbicacion(exp.getUbicacion());
        nuevaExp.setLogo(exp.getLogo());
        
        expServ.updateExp(nuevaExp);
    }
 
    
    @GetMapping("findById/{id}")
    public Experiencia buscarEducbyId(@PathVariable int id){
          return expServ.buscarExpById(id);
      }
    
    
//    @PutMapping("/update/exp/{id}")
//    public void updateExp(@PathVariable int id,
//            @RequestParam("empresa") String empresa,
//            @RequestParam("puesto") String puesto,
//            @RequestParam("desde") String desde,
//            @RequestParam("hasta") String hasta,
//            @RequestParam("ubicacion") String ubicacion,
//            @RequestParam("logo") String logo) {
//        Experiencia experiencia = expServ.buscarExpById(id);
//
//        experiencia.setEmpresa(empresa);
//        experiencia.setPuesto(puesto);
//        experiencia.setDesde(desde);
//        experiencia.setHasta(hasta);
//        experiencia.setUbicacion(ubicacion);
//        experiencia.setLogo(logo);
//
//        expServ.updateExp(experiencia);
//    }
    
    
    

}
