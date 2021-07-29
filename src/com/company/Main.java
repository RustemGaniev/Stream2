package com.company;
import java.util.*;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {



        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> families = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
        Collection<Person> persons = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            persons.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    families.get(new Random().nextInt(families.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    Education.values()[new Random().nextInt(Education.values().length)])
            );
        }


           long count = persons.stream()
                    .filter(p -> p.getAge() < 18)
                    .count();
           System.out.println(count);

           List<String> militaryMen = persons.stream()
                   .filter(p -> p.getSex() == Sex.MAN)
                   .filter(p -> p.getAge() > 17)
                   .filter(p -> p.getAge() < 28)
                   .map(p -> p.getFamily())
                   .collect(Collectors.toList());


           persons.stream()
                   .filter(p -> p.getEducation() == Education.HIGHER)
                   .filter(p -> p.getAge() > 17)
                   .filter(p -> (p.getSex() == Sex.MAN && p.getAge() < 66) || (p.getSex() == Sex.WOMAN && p.getAge() <61))
                   .collect(Collectors.toList());





        }





    }

