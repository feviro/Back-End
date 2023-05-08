package com.portfolio.proyecto.controller;
import com.portfolio.proyecto.entity.SoftSkill;
import com.portfolio.proyecto.service.SSoftSkill;
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
@RequestMapping("soft")
@CrossOrigin(origins = "https://portfolio-fvr.web.app/")
public class CSoftSkill {
    @Autowired
    SSoftSkill skill;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List<SoftSkill> verSkill(){
        return skill.verSkill();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public SoftSkill verSkill(@PathVariable int id){
    return skill.buscarSkill(id);
    }
    
    @PostMapping ("/crear")
    public String crearSkill (@RequestBody SoftSkill soft){
        skill.crearSkill(soft);
        return "Apartado de habilidad creado exitosamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarSkill(@PathVariable int id){
        skill.borrarSkill(id);
        return "Apartado de habilidad borrado exitosamente";
    }
    
    @PutMapping ("/editar/{id}")
    public void editarSkill(@RequestBody SoftSkill soft){
    skill.editarSkill(soft);
    }
    
    
}

