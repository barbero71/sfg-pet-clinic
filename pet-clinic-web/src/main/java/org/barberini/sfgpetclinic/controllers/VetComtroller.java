package org.barberini.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetComtroller {

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets() {

        return "vets/index";
    }
}
