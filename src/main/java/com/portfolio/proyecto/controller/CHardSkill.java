package com.portfolio.proyecto.controller;
import com.portfolio.proyecto.entity.HardSkill;
import com.portfolio.proyecto.service.SHardSkill;
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
@RequestMapping("hardskill")
@CrossOrigin(origins = "https://portfolio-fvr.web.app/")
public class CHardSkill {
    @Autowired
    SHardSkill hard;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List<HardSkill> verHardSkill(){
        return hard.verSkill();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public HardSkill verSkill(@PathVariable int id){
    return hard.buscarSkill(id);
    }
    
    @PostMapping ("/crear")
    public String agregarSkill(@RequestBody HardSkill skill){
        hard.crearSkill(skill);
        return "Apartado de habilidad creado exitosamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarSkill(@PathVariable int id){
        hard.borrarSkill(id);
        return "Apartado de habilidad borrado exitosamente";
    }
    
    @PutMapping ("/editar/{id}")
    public void editarSkill(@RequestBody HardSkill exp){
    hard.editarSkill(exp);
    }
    
    
}
