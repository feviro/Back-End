
package com.portfolio.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nombre;
    
    private String url;
    
    private String descripcion;

    public Proyecto() {
    }

    public Proyecto(int id, String nombre, String url, String imagen, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.url = url;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUrl() {
        return url;
    }

 

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
