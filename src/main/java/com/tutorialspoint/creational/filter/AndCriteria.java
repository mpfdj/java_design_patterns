package com.tutorialspoint.creational.filter;

import lombok.AllArgsConstructor;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@AllArgsConstructor
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        List<Person> otherCriteriaPersons = otherCriteria.meetCriteria(persons);

        List<Person> personList = Stream.of(firstCriteriaPersons, otherCriteriaPersons).flatMap(Collection::stream).collect(Collectors.toList());

        // https://mkyong.com/java8/java-8-find-duplicate-elements-in-a-stream/
        Set<Person> resultSet = new HashSet<>();
        List<Person> resultList = personList.stream().filter(person -> !resultSet.add(person)).toList();

        return resultList;
    }
}
