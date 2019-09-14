package com.playtika.javaacademy.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "zoo/")
@RestController
public class ZooController {

    @GetMapping(value = "animal")
    public Dog getAnimal(@RequestParam(value = "name") String name) {
        System.out.println("Request");
        return new Dog(name);
    }

}
