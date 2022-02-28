package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class Eg02Predicate {
    public static void main(String[] args) {

        Eg02Predicate obj = new Eg02Predicate();
        List<Person> people = List.of(new Person("Sachin", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", Gender.FEMALE)
        );

        // Using Declarative Approach
        obj.usingDeclarativeApproach(people);
    }

    public void usingDeclarativeApproach(List<Person> people) {
        people.stream()
                .filter(person -> Gender.FEMALE.equals(person.getGender()))
           //   .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
