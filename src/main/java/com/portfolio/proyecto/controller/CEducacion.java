package com.portfolio.proyecto.controller;
import com.portfolio.proyecto.entity.Educacion;
import com.portfolio.proyecto.service.SEducacion;
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
@RequestMapping("educacion")
@CrossOrigin(origins = "https://portfolio-fvr.web.app/")
public class CEducacion {
    @Autowired
    SEducacion educacion;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List<Educacion> verEducacion(){
        return educacion.verEducacion();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Educacion verEducacion(@PathVariable int id){
    return educacion.buscarEducacion(id);
    }
    
    @PostMapping ("/crear")
    public String agregarEducacion(@RequestBody Educacion edu){
        educacion.crearEducacion(edu);
        return "Apartado de educacion creado exitosamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarEducacion(@PathVariable int id){
        educacion.borrarEducacion(id);
        return "Apartado educacion borrado exitosamente";
    }
    
    @PutMapping ("/editar/{id}")
    public void editarEducacion(@RequestBody Educacion edu){
    educacion.editarEducacion(edu);
    }
    
    
}