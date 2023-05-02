
package com.avitmat.avitmat.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Clientes {
    
    @Id
    public String NombreApellido;
    public String Mail;
    public String NombreEmpresa;
    public Long Numero;

    public Clientes() {
    }

    public String getNombreApellido() {
        return NombreApellido;
    }

    public void setNombreApellido(String NombreApellido) {
        this.NombreApellido = NombreApellido;
    }

    public Long getNumero() {
        return Numero;
    }

    public void setNumero(Long Numero) {
        this.Numero = Numero;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public String getNombreEmpresa() {
        return NombreEmpresa;
    }

    public void setNombreEmpresa(String NombreEmpresa) {
        this.NombreEmpresa = NombreEmpresa;
    }
    
    
    
    
}
