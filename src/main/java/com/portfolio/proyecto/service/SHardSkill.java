
package com.portfolio.proyecto.service;
import com.portfolio.proyecto.entity.HardSkill;
import com.portfolio.proyecto.repository.RHardSkill;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHardSkill {
    @Autowired
    public RHardSkill skill;
    
    public List <HardSkill> verSkill(){
    List <HardSkill> listaSkill= skill.findAll();
    return listaSkill;
    }
    
    public HardSkill buscarSkill(int id){
       HardSkill listaSkill = skill.findById(id).orElse(null);
        return listaSkill;
        
    }
    
    public void crearSkill(HardSkill habilidad){
        skill.save(habilidad);
    }
    
    public void borrarSkill(int id){
        skill.deleteById(id);
    }
    
    public void editarSkill(HardSkill habilidad){
        skill.save(habilidad);
    }
    
    
}
