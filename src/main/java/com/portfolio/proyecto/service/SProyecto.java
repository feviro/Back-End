
package com.portfolio.proyecto.service;
import com.portfolio.proyecto.entity.Proyecto;
import com.portfolio.proyecto.repository.RProyecto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyecto {
    @Autowired
    public RProyecto proyecto;
    
    public List <Proyecto> verProyecto(){
    List <Proyecto> listaProyecto= proyecto.findAll();
    return listaProyecto;
    }
    
    public Proyecto buscarProyecto(int id){
       Proyecto listaProyecto = proyecto.findById(id).orElse(null);
        return listaProyecto;
        
    }
    
    public void crearProyecto(Proyecto proyectito){
        proyecto.save(proyectito);
    }
    
    public void borrarProyecto(int id){
        proyecto.deleteById(id);
    }
    
    public void editarProyecto(Proyecto proyectito){
        proyecto.save(proyectito);
    }
    
    
}
