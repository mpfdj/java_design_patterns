package com.tutorialspoint.creational.filter;

import java.util.List;

public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons;
        malePersons = persons.stream().filter(p -> p.getGender().equalsIgnoreCase("MALE")).toList();
        return malePersons;
    }
}
