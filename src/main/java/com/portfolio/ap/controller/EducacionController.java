package com.portfolio.ap.controller;

import com.portfolio.ap.entity.Educacion;
import com.portfolio.ap.service.IEducacionService;
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
@RequestMapping("/api/educacion")
public class EducacionController {

    @Autowired
    private IEducacionService educServ;

    @GetMapping("/get/educ")
    public List<Educacion> getEduc() {
        return educServ.getEduc();
    }

    @PostMapping("/new")
    public void crearEduc(@RequestBody Educacion educacion) {
        educServ.crearEduc(educacion);
    }

    @DeleteMapping("/delete/{id}")
    public void deletEduc(@PathVariable int id) {
        educServ.deleteEduc(id);
    }
    
        @PutMapping("/update/{id}")
      public void updateEduc(@PathVariable int id, @RequestBody Educacion educacion){

          Educacion nuevaEduc= educServ.buscarEducById(id);
          nuevaEduc.setInstitucion(educacion.getInstitucion());
          nuevaEduc.setTitulo(educacion.getTitulo());
          nuevaEduc.setDesde(educacion.getDesde());
          nuevaEduc.setHasta(educacion.getHasta());
          nuevaEduc.setUbicacion(educacion.getUbicacion());
          nuevaEduc.setLogo(educacion.getLogo());
          
          educServ.updateEduc(nuevaEduc);
      }

//    @PutMapping("/update/educ/{id}")
//    public void updateEduc(@PathVariable int id,
//            @RequestParam("institucion") String insti,
//            @RequestParam("titulo") String titulo,
//            @RequestParam("desde") String desde,
//            @RequestParam("hasta") String hasta,
//            @RequestParam("ubicacion") String ubic,
//            @RequestParam("logo") String logo) {
//        Educacion educacion = educServ.buscarEducById(id);
//
//        educacion.setInstitucion(insti);
//        educacion.setTitulo(titulo);
//        educacion.setDesde(desde);
//        educacion.setHasta(hasta);
//        educacion.setUbicacion(ubic);
//        educacion.setLogo(logo);
//
//        educServ.updateEduc(educacion);
//    }
      
      @GetMapping("findById/{id}")
      public Educacion buscarEducbyId(@PathVariable int id){
          return educServ.buscarEducById(id);
      }

}
