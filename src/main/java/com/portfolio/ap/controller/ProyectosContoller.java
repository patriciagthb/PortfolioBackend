package com.portfolio.ap.controller;

import com.portfolio.ap.entity.Proyectos;
import com.portfolio.ap.service.IProyectosService;
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
@RequestMapping("/api")
public class ProyectosContoller {
    
    @Autowired
    private IProyectosService proyServ;
    
    @GetMapping("/proyectos/get")
    public List<Proyectos> getEnc(){
        return proyServ.getProy();
    }
    
    @PostMapping("/proyectos/new")
    public void crearProy(@RequestBody Proyectos proyectos){
        proyServ.crearProy(proyectos);
    }
    
    @DeleteMapping("/proyectos/delete/{id}")
    public void deleteProy(@PathVariable int id){
        proyServ.deleteProy(id);
    }
    

}
