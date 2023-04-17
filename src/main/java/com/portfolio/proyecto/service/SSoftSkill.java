
package com.portfolio.proyecto.service;
import com.portfolio.proyecto.entity.SoftSkill;
import com.portfolio.proyecto.repository.RSoftSkill;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SSoftSkill {
    @Autowired
    public RSoftSkill skill;
    
    public List <SoftSkill> verSkill(){
    List <SoftSkill> listaSkill= skill.findAll();
    return listaSkill;
    }
    
    public SoftSkill buscarSkill(int id){
       SoftSkill listaSkill = skill.findById(id).orElse(null);
        return listaSkill;
        
    }
    
    public void crearSkill(SoftSkill habilidad){
        skill.save(habilidad);
    }
    
    public void borrarSkill(int id){
        skill.deleteById(id);
    }
    
    public void editarSkill(SoftSkill habilidad){
        skill.save(habilidad);
    }
    
    
}
