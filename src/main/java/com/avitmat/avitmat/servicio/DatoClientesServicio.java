
package com.avitmat.avitmat.servicio;

import com.avitmat.avitmat.entidades.Clientes;
import com.avitmat.avitmat.excepciones.MiException;
import com.avitmat.avitmat.repositorio.ClienteRepositorio;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatoClientesServicio {
    
    @Autowired
    ClienteRepositorio clientesRepositorio;
    
    @Transactional
    public void GuardarDatosClientes (String NombreApellido, String Mail, String NombreEmpresa, Long Numero) throws MiException{
        
        validar(NombreApellido, Mail, NombreEmpresa, Numero);
        
        Clientes clientes = new Clientes();
        
        clientes.setNombreApellido(NombreApellido);
        clientes.setMail(Mail);
        clientes.setNombreEmpresa(NombreEmpresa);
        clientes.setNumero(Numero);
        
        clientesRepositorio.save(clientes);
        
        
    }
    
    private void validar(String NombreApellido, String Mail, String NombreEmpresa, Long Numero)throws MiException{
        
        if(NombreApellido.isEmpty() || NombreApellido == null){
            throw new MiException("El nombre tiene que ser completado");
        }
        
        if(Mail.isEmpty() || Mail == null){
            throw new MiException("El mail tiene que ser completado");
        }
        if(NombreEmpresa.isEmpty() || NombreEmpresa == null){
            throw new MiException("El nombre de la empresa tiene que ser completado");
        }
        if(Numero == null){
            throw new MiException("El numero tiene que ser completado");
        }
        
    }
    
    
    
}
