package com.SpringBootLerning.SpringBoot.Question2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//making a controller for running the currency controller class, by making a controller class

@RestController
public class CurrencyController {
    @Autowired
    private CurrencyServiceConfiguration service;
        @GetMapping("/currency-configuration")
        public CurrencyServiceConfiguration retriveAllCourses(){
            return service;
        }


}
