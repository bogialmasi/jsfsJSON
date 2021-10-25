package hu.firstJSON.service;

import hu.firstJSON.domain.Pen;
import hu.firstJSON.domain.Person;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    private List<Pen> pens = new ArrayList<>();

    {
        pens.add(new Pen(31521, "blue", false));
        pens.add(new Pen(15248, "red", false));
        pens.add(new Pen(78459, "black", true));
    }

    private List<Person> people = new ArrayList<>();

    {
        people.add(new Person("Jack Sparrow", 22, pens.get(0)));
        people.add(new Person("William Dafoe", 40, pens.get(1)));
        people.add(new Person("Hello Kitty", 20, pens.get(2)));
    }

    public List<Pen> getPens() {
        return pens;
    }

    public List<Person> getPeople() {
        return people;
    }
}
