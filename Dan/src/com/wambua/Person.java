package com.wambua;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person was instantiated !");
    }

    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    public void getAge() {
        System.out.println("The age is: " + age);
    }
}
