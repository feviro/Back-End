
package com.portfolio.proyecto.repository;

import com.portfolio.proyecto.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RAdmin extends JpaRepository <Admin, String>{
    
}
