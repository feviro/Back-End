package com.portfolio.proyecto.controller;
import com.portfolio.proyecto.entity.Contacto;
import com.portfolio.proyecto.service.SContacto;
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
@RequestMapping("contacto")
@CrossOrigin(origins = "https://portfolio-fvr.web.app/")
public class CContacto {
    @Autowired
    SContacto contacto;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List<Contacto> verContacto(){
        return contacto.verContacto();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Contacto verContacto(@PathVariable int id){
    return contacto.buscarContacto(id);
    }
    
    @PostMapping ("/crear")
    public String agregarContacto(@RequestBody Contacto conta){
        contacto.crearContacto(conta);
        return "Contacto creado exitosamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarContacto(@PathVariable int id){
        contacto.borrarContacto(id);
        return "El usuario fue borrado exitosamente";
    }
    
    @PutMapping ("/editar/{id}")
    public void editarContacto(@RequestBody Contacto conta){
    contacto.editarContacto(conta);
    }
    
    
}

