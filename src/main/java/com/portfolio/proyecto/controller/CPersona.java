
package com.portfolio.proyecto.controller;
import com.portfolio.proyecto.entity.Persona;
import com.portfolio.proyecto.service.SPersona;
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
@RequestMapping("persona")
@CrossOrigin(origins = "https://portfolio-fvr.web.app/")
public class CPersona {
    @Autowired
    SPersona persoServicio;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List<Persona> verPersona(){
        return persoServicio.verPersona();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Persona verPersona(@PathVariable int id){
    return persoServicio.buscarPersona(id);
    }
    
    @PostMapping ("/crear")
    public String agregarPersona(@RequestBody Persona pers){
        persoServicio.crearPersona(pers);
        return "Dato creado exitosamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarPersona(@PathVariable int id){
        persoServicio.borrarPersona(id);
        return "La persona fue borrada exitosamente";
    }
    
    @PutMapping ("/editar/{id}")
    public void editarPersona(@RequestBody Persona pers){
    persoServicio.editarPersona(pers);
    }
   
    
    
}
