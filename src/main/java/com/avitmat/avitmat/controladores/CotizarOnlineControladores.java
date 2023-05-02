
package com.avitmat.avitmat.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cotizar")//localhost:8080/cotizar
public class CotizarOnlineControladores {
    
    
    @GetMapping("/CotizarOnline")//localhost:8080/cotizar/CotizarOnline
    public String CotizarOnline(){
        
        return "CotizarOnline.html";
        
    }
    
    
}
