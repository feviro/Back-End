
package com.portfolio.proyecto.service;
import com.portfolio.proyecto.entity.Contacto;
import com.portfolio.proyecto.repository.RContacto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SContacto{
    @Autowired
    public RContacto contacto;
    
    public List <Contacto> verContacto(){
    List <Contacto> listaContacto= contacto.findAll();
    return listaContacto;
    }
    
    public Contacto buscarContacto(int id){
       Contacto listaContacto = contacto.findById(id).orElse(null);
        return listaContacto;
        
    }
    
    public void crearContacto(Contacto contactito){
        contacto.save(contactito);
    }
    
    public void borrarContacto(int id){
        contacto.deleteById(id);
    }
    
    public void editarContacto(Contacto contactito){
        contacto.save(contactito);
    }
    
    
}


