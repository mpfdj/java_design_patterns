package com.tutorialspoint.creational.filter;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class CriteriaMaleTest {

    @Test
    public void test() {

        Person miel = new Person("Miel", "male", "married");
        Person kim = new Person("kim", "female", "single");
        List<Person> persons = new ArrayList<>();
        persons.add(miel);
        persons.add(kim);


        List<Person> males;
        males = persons.stream().filter(p -> p.getGender().equalsIgnoreCase("MALE")).toList();

        System.out.println(persons);
        System.out.println(males);


    }


}