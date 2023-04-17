
package com.portfolio.proyecto.service;
import com.portfolio.proyecto.entity.Educacion;
import com.portfolio.proyecto.repository.REducacion;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion {
    @Autowired
    public REducacion educacion;
    
    public List <Educacion> verEducacion(){
    List <Educacion> listaEducacion= educacion.findAll();
    return listaEducacion;
    }
    
    public Educacion buscarEducacion(int id){
       Educacion listaEducacion = educacion.findById(id).orElse(null);
        return listaEducacion;
        
    }
    
    public void crearEducacion(Educacion educ){
        educacion.save(educ);
    }
    
    public void borrarEducacion(int id){
        educacion.deleteById(id);
    }
    
    public void editarEducacion(Educacion educ){
        educacion.save(educ);
    }
    
    
}

