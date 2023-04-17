
package com.portfolio.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String titulo;
    
    private String descripcion;
    
    @Temporal(TemporalType.DATE)
    private Date periodoComienzo;
    
    @Temporal(TemporalType.DATE)
    private Date periodoFinal;
    
    private String imagen;
    
    private String link;

   
    public Experiencia(String titulo, String descripcion, Date periodoComienzo, Date periodoFinal, String imagen, String link) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.periodoComienzo = periodoComienzo;
        this.periodoFinal = periodoFinal;
        this.imagen = imagen;
        this.link = link;
    }

    public Experiencia() {
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

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
