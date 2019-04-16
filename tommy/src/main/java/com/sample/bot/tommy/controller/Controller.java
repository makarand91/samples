package com.sample.bot.tommy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @RequestMapping(value="/asktommy",method= RequestMethod.POST)
    public String askQuestion(String question){

        return "I dont know answer";

    }

}
