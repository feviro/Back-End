
package com.portfolio.proyecto.repository;

import com.portfolio.proyecto.entity.HardSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHardSkill extends JpaRepository <HardSkill, Integer>{
    
}
