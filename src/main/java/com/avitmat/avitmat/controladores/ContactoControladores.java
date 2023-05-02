
package com.avitmat.avitmat.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contacto")//localhost:8080/contacto
public class ContactoControladores {
    
    @GetMapping("/avitmat")//localhost:8080/contacto/avitmat
    public String avitmat(){
        
        return "Contacto.html";
        
    }
    
}
