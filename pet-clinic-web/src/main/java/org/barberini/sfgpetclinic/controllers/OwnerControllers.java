package org.barberini.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerControllers {

    @RequestMapping({"","/","/index","index.html"})
    public String listOwners() {

        return "owners/index";
    }
}
