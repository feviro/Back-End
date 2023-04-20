
package com.portfolio.proyecto.repository;

import com.portfolio.proyecto.entity.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RContacto extends JpaRepository<Contacto, Integer>{
    
}
