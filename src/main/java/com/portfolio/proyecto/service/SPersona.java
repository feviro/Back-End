
package com.portfolio.proyecto.service;
import com.portfolio.proyecto.entity.Persona;
import com.portfolio.proyecto.repository.RPersona;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona {
    @Autowired
    public RPersona persoRepo;
    
    public List <Persona> verPersona(){
    List <Persona> listaPersona= persoRepo.findAll();
    return listaPersona;
    }
    
    public Persona buscarPersona(int id){
       Persona listaPersona = persoRepo.findById(id).orElse(null);
        return listaPersona;
        
    }
    
    public void crearPersona(Persona perso){
        persoRepo.save(perso);
    }
    
    public void borrarPersona(int id){
        persoRepo.deleteById(id);
    }
    
    public void editarPersona(Persona perso){
        persoRepo.save(perso);
    }
    
    
}
