
package com.appwithspring.demo1.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Corregido a @Controller
public class UserController {

    @GetMapping("/index") // Corregido a "/index"
    public String index(Model model) {
        model.addAttribute("title", "Hola Mundo");
        model.addAttribute("name", "RAFAEL");
        model.addAttribute("lastname", "SANCHEZ SOLANO");
        return "index"; // Asegúrate de que el archivo index.html esté en la carpeta templates
    }
}