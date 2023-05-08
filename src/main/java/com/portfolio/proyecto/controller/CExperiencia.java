package com.portfolio.proyecto.controller;
import com.portfolio.proyecto.entity.Experiencia;
import com.portfolio.proyecto.service.SExperiencia;
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
@RequestMapping("experiencia")
@CrossOrigin(origins = "https://portfolio-fvr.web.app/")
public class CExperiencia {
    @Autowired
    SExperiencia experiencia;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List<Experiencia> verExperiencia(){
        return experiencia.verExperiencia();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Experiencia verExperiencia(@PathVariable int id){
    return experiencia.buscarExperiencia(id);
    }
    
    @PostMapping ("/crear")
    public String agregarExperiencia(@RequestBody Experiencia exp){
        experiencia.crearExperiencia(exp);
        return "Apartado de experiencia creado exitosamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarExperiencia(@PathVariable int id){
        experiencia.borrarExperiencia(id);
        return "Apartado experiencia borrado exitosamente";
    }
    
    @PutMapping ("/editar/{id}")
    public void editarExperiencia(@RequestBody Experiencia exp){
    experiencia.crearExperiencia(exp);
    }
    
    
}
