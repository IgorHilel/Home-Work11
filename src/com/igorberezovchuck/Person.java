package com.igorberezovchuck;

public class Person {

    private String firstName;
    private String surName;
    private int age;
    private double weight;
    private double height;

    public Person(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }

    public Person(String firstName, String surName, int age, double weight, double height) {
        this.firstName = firstName;
        this.surName = surName;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "\n{" +
                "Имя ='" + firstName + '\'' +
                ", Фамилия = '" + surName + '\'' +
                ", Возраст = " + age +
                ", Вес = " + weight +
                ", Рост =" + height +
                '}';
    }

}
