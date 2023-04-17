
package com.portfolio.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class HardSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nombre;
    
    private int progreso;
    
    private String color;
    
    private String logo;

    public HardSkill() {
    }

    public HardSkill(int id, String nombre, int progreso, String color, String logo) {
        this.id = id;
        this.nombre = nombre;
        this.progreso = progreso;
        this.color = color;
        this.logo = logo;
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

    public String getColor() {
        return color;
    }

    public String getLogo() {
        return logo;
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

    public void setColor(String color) {
        this.color = color;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
    
    
    
}
