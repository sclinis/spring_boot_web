package com.navent.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleRestController {

    //@see http://www.baeldung.com/spring-requestmapping
    @RequestMapping(value = {"/hello", "/hi"}, method = RequestMethod.GET) // atiende un servicio rest GET en /hello, y en hi
    public String helloWorld() {
        return "Hello World!!";
    }

    @GetMapping(value = "/bye") // atiende un servicio rest GET
    public String byeWorld() {
        return "Bye World!!";
    }

    @GetMapping
    public String test() {
        return "llalla";
    }

    @RequestMapping(value = "*", method = RequestMethod.GET) // atiende el resto de las requests https://springframework.guru/spring-requestmapping-annotation/
    public String allFallback() {
        return "Fallback for All Requests";
    }

}
