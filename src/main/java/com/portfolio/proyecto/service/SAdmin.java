
package com.portfolio.proyecto.service;
import com.portfolio.proyecto.entity.Admin;
import com.portfolio.proyecto.repository.RAdmin;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SAdmin{
    @Autowired
    public RAdmin admin;
    
    public List <Admin> verAdmin(){
    List <Admin> listaAdmin= admin.findAll();
    return listaAdmin;
    }
    
    public Admin buscarAdmin(String usuario){
       Admin listaAdmin = admin.findById(usuario).orElse(null);
        return listaAdmin;
        
    }
    
    public void crearAdmin(Admin adm){
        admin.save(adm);
    }
    
    public void borrarAdmin(String usuario){
        admin.deleteById(usuario);
    }
    
    public void editarAdmin(Admin adm){
        admin.save(adm);
    }
    
    
}



