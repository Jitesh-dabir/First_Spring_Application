package com.example.firstspringapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping(value = {"", "/", "/home"})
    public String show() {
        return "\n" +
                "Hello this is my first web api";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHelloM(@RequestParam(value = "firstName") String firstName) {
        return "\nHello " + firstName+" is my first web api";
    }

    @GetMapping(value = {"/param/{name}"})
    public String sayHello(@PathVariable String name) {
        return "\nHello " + name + " is my first web api";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody Person person) {
        return "\nHello " + person.getFirstName() +" - "+ person.getLastName() + "";
    }

    @PutMapping("/put/{firstName}")
    public String sayHelloPut(@PathVariable String firstName,@RequestParam (value = "lastName") String lastName) {
        return "\nHello " + firstName +" - "+ lastName + "";
    }
}
