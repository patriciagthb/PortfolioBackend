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
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/encabezado")
public class EncabezadoController {
    
    @Autowired
    private IEncabezadoService encServ;
    
    @GetMapping("/get/enc")
    public List<Encabezado> getEnc(){
        return encServ.getEnc();
    }
    
    @PostMapping("/new/enc")
    public void crearEnc(@RequestBody Encabezado encabezado){
        encServ.crearEnc(encabezado);
    }
    
    @DeleteMapping("/delete/enc/{id}")
    public void deleteEnc(@PathVariable int id){
        encServ.deleteEnc(id);
    }
    
    @PutMapping("/update/{id}")
      public void updateEnc(@PathVariable int id, @RequestBody Encabezado enc){

          Encabezado nuevoEnc= encServ.buscarEncById(id);
          nuevoEnc.setNombre(enc.getNombre());
          nuevoEnc.setFotoperfil(enc.getFotoperfil());
          nuevoEnc.setTitulo(enc.getTitulo());
          nuevoEnc.setUbicacion(enc.getUbicacion());
          
          encServ.updateEnc(nuevoEnc);
      }    
    
    @GetMapping("findById/{id}")
    public Encabezado buscarEducbyId(@PathVariable int id){
          return encServ.buscarEncById(id);
      }
                          
}

//    @PutMapping("/update/enc/{id}")
//    public void updateEnc(@PathVariable int id,
//                          @RequestParam("nombre") String nombre,
//                          @RequestParam("fotoperfil") String foto,
//                          @RequestParam("titulo") String titulo,
//                          @RequestParam("ubicacion") String ubicacion){
//        Encabezado encabezado = encServ.buscarEncById(id);
//        
//        encabezado.setNombre(nombre);
//        encabezado.setFotoperfil(foto);
//        encabezado.setTitulo(titulo);
//        encabezado.setUbicacion(ubicacion);
//        
//        encServ.updateEnc(encabezado);
//    }
