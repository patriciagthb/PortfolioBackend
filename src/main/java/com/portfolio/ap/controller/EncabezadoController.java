package com.portfolio.ap.controller;

import com.portfolio.ap.entity.Encabezado;
import com.portfolio.ap.service.IEncabezadoService;
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
@CrossOrigin(origins = "https://portfolio-argprog2022.web.app")
@RequestMapping("/api")
public class EncabezadoController {
    
    @Autowired
    private IEncabezadoService encServ;
    
    @GetMapping("/encabezado/get")
    public List<Encabezado> getEnc(){
        return encServ.getEnc();
    }
    
    @PostMapping("/encabezado/new")
    public void crearEnc(@RequestBody Encabezado encabezado){
        encServ.crearEnc(encabezado);
    }
    
    @DeleteMapping("/encabezado/delete/{id}")
    public void deleteEnc(@PathVariable int id){
        encServ.deleteEnc(id);
    }
    
    @PutMapping("/encabezado/update/{id}")
      public void updateEnc(@PathVariable int id, @RequestBody Encabezado enc){

          Encabezado nuevoEnc= encServ.buscarEncById(id);
          nuevoEnc.setNombre(enc.getNombre());
          nuevoEnc.setFotoperfil(enc.getFotoperfil());
          nuevoEnc.setTitulo(enc.getTitulo());
          nuevoEnc.setUbicacion(enc.getUbicacion());
          
          encServ.updateEnc(nuevoEnc);
      }    
    
    @GetMapping("/encabezado/findById/{id}")
    public Encabezado buscarEducbyId(@PathVariable int id){
          return encServ.buscarEncById(id);
      }
                          
}


