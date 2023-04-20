
package com.portfolio.proyecto.repository;
import com.portfolio.proyecto.entity.SoftSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSoftSkill extends JpaRepository <SoftSkill, Integer>{
    
}
