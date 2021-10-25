package hu.firstJSON.controllers;

import hu.firstJSON.domain.Pen;
import hu.firstJSON.domain.Person;
import hu.firstJSON.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private Service service;

    @GetMapping("/pens")
    public List<Pen> pens() {
        List<Pen> pens = service.getPens();
        return pens;
    }

    @GetMapping("/people")
    public List<Person> people() {
        List<Person> people = service.getPeople();
        return people;
    }

    @GetMapping("/")
    public String home() {
        return "/";
    }
}
