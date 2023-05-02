
package com.avitmat.avitmat.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blog")//localhost:8080/blog
public class BlogControladores {
    
    @GetMapping("/blogAvitmat")//localhost:8080/blog/blogAvitmat
    public String blogAvitmat(){
        
        return "Blog.html";
        
    }
}
