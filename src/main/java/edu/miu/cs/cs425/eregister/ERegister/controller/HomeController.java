package edu.miu.cs.cs425.eregister.ERegister.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping(value = {"/" ,"/eRegistrar" ,"/eRegistrar/home"})
    public String displayHomePage(){
        return "home/index";
    }
}