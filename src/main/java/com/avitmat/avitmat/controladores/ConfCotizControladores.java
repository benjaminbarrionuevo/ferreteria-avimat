
package com.avitmat.avitmat.controladores;

import com.avitmat.avitmat.excepciones.MiException;
import com.avitmat.avitmat.servicio.DatoClientesServicio;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/cotizacion") //localhost:8080/cotizacion
public class ConfCotizControladores {
    
    @Autowired
    private DatoClientesServicio datoclientesServicio;
    
    @GetMapping("/confirmar")//localhost:8080/cotizacion/confirmar
    public String Confirmar(){
        return "ConfirmarCotizacion.html";
    }
    
    @PostMapping("/confirmacion")
    public String confirmacion(@RequestParam String NombreApellido, String Mail, String NombreEmpresa, Long Numero){
        
        try {
            datoclientesServicio.GuardarDatosClientes(NombreApellido, Mail, NombreEmpresa, Numero);
        } catch (MiException ex) {
            Logger.getLogger(ConfCotizControladores.class.getName()).log(Level.SEVERE, null, ex);
            return "ConfirmarCotizacion.html";
        }
        
        return "index.html";
    }
    
}
