
package com.portfolio.proyecto.controller;
import com.portfolio.proyecto.entity.Admin;
import com.portfolio.proyecto.service.SAdmin;
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
@RequestMapping("admin")
@CrossOrigin(origins = "https://portfoliofvr.web.app/")
public class CAdmin {
    @Autowired
    SAdmin admin;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List<Admin> verAdmin(){
        return admin.verAdmin();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Admin verAdmin(@PathVariable String usuario){
    return admin.buscarAdmin(usuario);
    }
    
    @PostMapping ("/crear")
    public String agregarAdmin(@RequestBody Admin adm){
        admin.crearAdmin(adm);
        return "Dato creado exitosamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarAdmin(@PathVariable String usuario){
        admin.borrarAdmin(usuario);
        return "El usuario fue borrado exitosamente";
    }
    
    @PutMapping ("/editar/{id}")
    public void editarAdmin(@RequestBody Admin adm){
    admin.editarAdmin(adm);
    }
    
    
}
