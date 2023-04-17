
package com.portfolio.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Persona {
   @Id
    private int id;
    
    private String titulo;
    
    private String descripcion;
    
    private String nombre;
    
    private String foto;
    
    private String banner;

    public Persona() {
    }

    public Persona(int id, String titulo, String descripcion, String nombre, String foto, String banner) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.foto = foto;
        this.banner = banner;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFoto() {
        return foto;
    }

    public String getBanner() {
        return banner;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }
    
    
}

