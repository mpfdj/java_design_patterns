package com.tutorialspoint.creational.filter;

import java.util.List;

public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons;
        femalePersons = persons.stream().filter(p -> p.getGender().equalsIgnoreCase("FEMALE")).toList();
        return femalePersons;
    }
}
