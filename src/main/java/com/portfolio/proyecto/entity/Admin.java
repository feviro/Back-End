
package com.portfolio.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {
    @Id
    private String usuario;
    
    private String contraseña;
    
    private int logueado;

    public Admin() {
    }

    public Admin(String usuario, String contraseña, int logueado) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.logueado = logueado;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }
    
     public int getLogueado() {
        return logueado;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public void setLogueado(int logueado) {
        this.logueado = logueado;
    }
    
    
    
    
}
