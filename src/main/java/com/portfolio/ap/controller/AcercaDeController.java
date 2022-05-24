package com.portfolio.ap.controller;

import com.portfolio.ap.entity.AcercaDe;
import com.portfolio.ap.service.IAcercaDeService;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class AcercaDeController {
    
    @Autowired
    private IAcercaDeService acercaServ;
    
    @GetMapping("/acerca/get")
    public List<AcercaDe> getAcerca(){
    return acercaServ.getAcerca();
    }
    
    
    @GetMapping("/acerca/ver")
    @ResponseBody
    public List<AcercaDe> verAcercaDe(){
        return acercaServ.verAcercaDe();
    }
    
    @PostMapping("/acerca/new")
    public void crearAcercaDe(@RequestBody AcercaDe acerca){
        acercaServ.crearAcercaDe(acerca);
    }
    
    @DeleteMapping("/acerca/delete/{id}")
    public void borrarAcercaDe(@PathVariable int id){
        acercaServ.borrarAcercaDe(id);
    }
    
    @PutMapping("/acerca/update/{id}")
      public void updateAcerca(@PathVariable int id, @RequestBody AcercaDe acerca){

          AcercaDe acercaNuevo=acercaServ.buscarAcercabyId(id);
          acercaNuevo.setAcercaDe(acerca.getAcercaDe());
          
          acercaServ.updateAcerca(acercaNuevo);
      }
    
    @GetMapping("/acerca/findById/{id}")
    public AcercaDe buscarAcercaById(@PathVariable int id){
        return acercaServ.buscarAcercabyId(id);
        
    }
    
}
