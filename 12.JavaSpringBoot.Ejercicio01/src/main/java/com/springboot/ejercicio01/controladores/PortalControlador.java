package com.springboot.ejercicio01.controladores;

import com.springboot.ejercicio01.servicios.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PortalControlador {

    @GetMapping("/")
    public String index(){
        return "index.html";
    }

    @GetMapping("/libro")
    public String registro() {
        return "registro.html";
    }

}
