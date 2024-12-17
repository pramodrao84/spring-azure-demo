package com.microservices.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class testController{

    @GetMapping("/info")
    public String print(){
        return "Application deployed on azure successfully!! Have a good day!";
    }

}
