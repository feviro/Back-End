
package com.portfolio.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SoftSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nombre;
    
    private int progreso;

    public SoftSkill() {
    }

    public SoftSkill(int id, String nombre, int progreso) {
        this.id = id;
        this.nombre = nombre;
        this.progreso = progreso;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getProgreso() {
        return progreso;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProgreso(int progreso) {
        this.progreso = progreso;
    }
    
    
}
