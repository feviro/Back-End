package com.portfolio.proyecto.controller;
import com.portfolio.proyecto.entity.Proyecto;
import com.portfolio.proyecto.service.SProyecto;
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
@RequestMapping("proyecto")
@CrossOrigin(origins = "https://portfolio-fvr.web.app/")
public class CProyecto {
    @Autowired
    SProyecto proyecto;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List<Proyecto> verProyecto(){
        return proyecto.verProyecto();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Proyecto verProyecto(@PathVariable int id){
    return proyecto.buscarProyecto(id);
    }
    
    @PostMapping ("/crear")
    public String crearProyecto(@RequestBody Proyecto proyectito){
        proyecto.crearProyecto(proyectito);
        return "Apartado de habilidad creado exitosamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarSkill(@PathVariable int id){
        proyecto.borrarProyecto(id);
        return "Apartado de habilidad borrado exitosamente";
    }
    
    @PutMapping ("/editar/{id}")
    public void editarProyecto(@RequestBody Proyecto proyectito){
    proyecto.editarProyecto(proyectito);
    }
    
    
}
