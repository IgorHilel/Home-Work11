package com.igorberezovchuck;

import java.util.Random;

public class Person {

    private String name;
    private String surName;
    private int age;
    private int weight;
    private int height;

    public Person() {
        this.name = getName();
        this.surName = getSurname();
        this.age = getAge();
        this.weight = getWeight();
        this.height = getHeight();
    }

    public Person(String name, String surName, int age, int weight, int height) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        String[] names = {"Андрей", "Антон", "Анатолий", "Артём", "Богдан", "Борис ", "Вадим ", "Валентин ", "Валерий ",
                "Василий ", "Виктор", "Виталий ", "Влад", "Владимир", "Вячеслав", "Геннадий ", "Георгий", "Григорий",
                "Денис", "Евгений ", "Егор ", "Иван ", "Игорь", "Кирилл", "Леонид", "Максим", "Михаил", "Назар", "Олег",
                "Павел", "Пётр", "Семён", "Сергей", "Станислав", "Степан", "Тарас", "Фёдор", "Эдуард", "Юрий", "Ярослав"};
        Random rand = new Random();
        int temp = rand.nextInt(40);
        return name = names[temp];
    }

    public String getSurname() {
        String[] surnames = {"Иванов", "Смирнов", "Кузнецов", "Попов", "Васильев", "Петров ", "Соколов ", "Михайлов ",
                "Новиков ", "Фёдоров ", "Морозов", "Волков ", "Алексеев", "Лебедев", "Семёнов", "Егоров ", "Павлов",
                "Козлов", "Степанов ", "Николаев ", "Орлов ", "Андреев", "Макаров", "Никитин", "Захаров", "Акимов",
                "Акинфиев", "Акулин", "Алтухов", "Булочников", "Быков", "Быченко", "Вакуленко", "Варченко", "Васечко",
                "Голофтеев", "Гордеев", "Горелов", "Девяткин", "Жуков"};
        Random rand = new Random();
        int temp = rand.nextInt(40);
        return surName = surnames[temp];
    }

    public int getAge() {
        Random rand = new Random();
        int temp = rand.nextInt(42) + 18;
        return age = temp;
    }

    public int getWeight() {
        Random rand = new Random();
        int temp = rand.nextInt(50) + 50;
        return weight = temp;
    }

    public int getHeight() {
        Random rand = new Random();
        int temp = rand.nextInt(50) + 150;
        return height = temp;
    }

    public String toString() {
        return "\nPerson{" +
                "name=" + name +
                ", surName=" + surName +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                "}";
    }

}
