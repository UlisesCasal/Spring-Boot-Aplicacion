package com.aplicacion.Aplicacion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {


    //BUSCARA EN LA CARPETA UN ARCHIVO QUE SE LLAME INDEX.HTML
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/userForm")
    public String userForm() {
        return "user-form/user-view";
    }
}
