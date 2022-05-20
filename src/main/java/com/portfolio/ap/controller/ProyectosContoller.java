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
@RequestMapping("/api/proyectos")
public class ProyectosContoller {
    
    @Autowired
    private IProyectosService proyServ;
    
    @GetMapping("/get/proy")
    public List<Proyectos> getEnc(){
        return proyServ.getProy();
    }
    
    @PostMapping("/new/proy")
    public void crearProy(@RequestBody Proyectos proyectos){
        proyServ.crearProy(proyectos);
    }
    
    @DeleteMapping("/delete/proy/{id}")
    public void deleteProy(@PathVariable int id){
        proyServ.deleteProy(id);
    }
    
    @PutMapping("/update/proy/{id}")
    public void updateProy(@PathVariable int id,
                           @RequestParam("nombre") String nombre,
                           @RequestParam("descripcion") String descripcion,
                           @RequestParam("fecha") String fecha,
                           @RequestParam("imagenes") String imagenes){
        Proyectos proyectos = proyServ.buscarProyById(id);
        
        proyectos.setNombre(nombre);
        proyectos.setDescripcion(descripcion);
        proyectos.setFecha(fecha);
        proyectos.setImagenes(imagenes);
        
        proyServ.updateProy(proyectos);
    }
}
