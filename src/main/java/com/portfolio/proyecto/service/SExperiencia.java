
package com.portfolio.proyecto.service;
import com.portfolio.proyecto.entity.Experiencia;
import com.portfolio.proyecto.repository.RExperiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
    @Autowired
    public RExperiencia experiencia;
    
    public List <Experiencia> verExperiencia(){
    List <Experiencia> listaExperiencia= experiencia.findAll();
    return listaExperiencia;
    }
    
    public Experiencia buscarExperiencia(int id){
       Experiencia listaExperiencia = experiencia.findById(id).orElse(null);
        return listaExperiencia;
        
    }
    
    public void crearExperiencia(Experiencia trabajo){
        experiencia.save(trabajo);
    }
    
    public void borrarExperiencia(int id){
        experiencia.deleteById(id);
    }
    
    public void editarExperiencia(Experiencia trabajo){
        experiencia.save(trabajo);
    }
    
    
}
