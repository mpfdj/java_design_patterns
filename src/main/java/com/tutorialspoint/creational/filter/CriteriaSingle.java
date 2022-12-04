package com.tutorialspoint.creational.filter;

import java.util.List;

public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons;
        singlePersons = persons.stream().filter(p->p.getMaritalStatus().equalsIgnoreCase("SINGLE")).toList();
        return singlePersons;
    }
}
