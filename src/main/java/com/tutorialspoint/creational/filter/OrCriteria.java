package com.tutorialspoint.creational.filter;

import lombok.AllArgsConstructor;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@AllArgsConstructor
public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    @Override
    public List<Person> meetCriteria(List<Person> persons) {

        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        List<Person> otherCriteriaPersons = otherCriteria.meetCriteria(persons);

        List<Person> personList = Stream.of(firstCriteriaPersons, otherCriteriaPersons).flatMap(Collection::stream).collect(Collectors.toList());

        List<Person> resultList = personList.stream().distinct().collect(Collectors.toList());
        return resultList;
    }
}
