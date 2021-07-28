package com.company;

public class Person {

    String name;
    String family;
    int age;
    Sex sex;
    Education education;

    public Person(String name, String family, int age, Sex sex, Education education){

        this.age = age;
        this.name = name;
        this.family = family;
        this.sex = sex;
        this.education = education;

    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public Education getEducation() {
        return education;
    }

    @Override
    public String toString() {
        return "Person{ " +
                "name='" + name + '\'' +
                ", family='" + family + '\''+
                ", age='" + age +
                ", sex='" + sex +
                ", education='" + education +
                "}";

    }

}
