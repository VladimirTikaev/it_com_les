package com.overone.controller;

import com.overone.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private PersonService personService;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }


    @PostMapping("/hiName")
    public String hi(@RequestParam("sender") String sender, Model model)  {

        model.addAttribute("mySender", sender);
//        model.addAttribute("persons", personService.getAllPerson());
        model.addAttribute("persons", personService.getPersonByName(sender));


        return "heSender";
    }

}
