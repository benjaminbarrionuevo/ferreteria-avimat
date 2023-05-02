
package com.avitmat.avitmat.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")//localhost:8080/
public class PortalControladores {
    
    @GetMapping("/")
    public String index(){
        
        return "index.html";
    }
}
