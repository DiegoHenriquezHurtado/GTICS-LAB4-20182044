package com.example.lab420182044.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value ={"/paginaPrincipal"})
    public String paginaPrincipal(){
        return "index";
    }
}
