
package com.avitmat.avitmat.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stock {
    
    @Id
    private Integer codigo;
    private String rubro;
    private String normbre;
    private Integer cantidad;

    public Stock() {
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getNormbre() {
        return normbre;
    }

    public void setNormbre(String normbre) {
        this.normbre = normbre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
