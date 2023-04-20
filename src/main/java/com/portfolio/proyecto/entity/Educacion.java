
package com.portfolio.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

 @Entity
public class Educacion {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     
     private String descripcion;
     
     private String tituloObtenido;
     
     @Temporal(TemporalType.DATE)
     private Date periodoComienzo;
     
     @Temporal(TemporalType.DATE)
     private Date periodoFinal;
     
     private String imagen;
     
     private String link;

    public Educacion() {
    }

    public Educacion(int id, String descripcion, String tituloObtenido, Date periodoComienzo, Date periodoFinal, String imagen, String link) {
        this.id = id;
        this.descripcion = descripcion;
        this.tituloObtenido = tituloObtenido;
        this.periodoComienzo = periodoComienzo;
        this.periodoFinal = periodoFinal;
        this.imagen = imagen;
        this.link = link;
    }

    public int getId() {
        return id;
    }
    
    

    public String getDescripcion() {
        return descripcion;
    }

    public String getTituloObtenido() {
        return tituloObtenido;
    }

    public Date getPeriodoComienzo() {
        return periodoComienzo;
    }

    public Date getPeriodoFinal() {
        return periodoFinal;
    }

    public String getImagen() {
        return imagen;
    }

    public String getLink() {
        return link;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTituloObtenido(String tituloObtenido) {
        this.tituloObtenido = tituloObtenido;
    }

    public void setPeriodoComienzo(Date periodoComienzo) {
        this.periodoComienzo = periodoComienzo;
    }

    public void setPeriodoFinal(Date periodoFinal) {
        this.periodoFinal = periodoFinal;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setLink(String link) {
        this.link = link;
    }
    
    
     
    
}
