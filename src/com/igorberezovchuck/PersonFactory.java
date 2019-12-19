package com.igorberezovchuck;

import java.util.Random;

public class PersonFactory {

    private static String[] names = {"Андрей", "Антон", "Анатолий", "Артём", "Богдан", "Борис ", "Вадим ", "Валентин ",
            "Валерий ", "Василий ", "Виктор", "Виталий ", "Влад", "Владимир", "Вячеслав", "Геннадий ", "Георгий",
            "Григорий", "Денис", "Евгений ", "Егор", "Иван", "Игорь", "Кирилл", "Леонид", "Максим", "Михаил", "Назар",
            "Олег", "Павел", "Пётр", "Семён", "Сергей", "Станислав", "Степан", "Тарас", "Фёдор", "Эдуард", "Юрий",
            "Ярослав"};
    private static String[] surNames = {"Иванов", "Смирнов", "Кузнецов", "Попов", "Васильев", "Петров", "Соколов",
            "Михайлов", "Новиков", "Фёдоров", "Морозов", "Волков", "Алексеев", "Лебедев", "Семёнов", "Егоров",
            "Павлов", "Козлов", "Степанов", "Николаев ", "Орлов", "Андреев", "Макаров", "Никитин", "Захаров", "Акимов",
            "Акинфиев", "Акулин", "Алтухов", "Булочников", "Быков", "Быченко", "Вакуленко", "Варченко", "Васечко",
            "Голофтеев", "Гордеев", "Горелов", "Девяткин", "Жуков"};

    private static final Random RANDOM = new Random();

    public static Person[] createRandomList(int count) {
        Person[] people = new Person[count];
        for (int i = 0; i < people.length; i++) {
            people[i] = createRandomPerson();
        }
        return people;
    }

    private static Person createRandomPerson() {
        String name = names[RANDOM.nextInt(names.length)];
        String surName = surNames[RANDOM.nextInt(names.length)];
        int age = RANDOM.nextInt(42) + 18;
        double tempValue = 50 + (100 - 50) * RANDOM.nextDouble();
        double weight = (int) Math.round(tempValue * 10) / 10.0;
        tempValue = 150 + (200 - 150) * RANDOM.nextDouble();
        double height = (int) Math.round(tempValue * 10) / 10.0;
        return new Person(name, surName, age, weight, height);
    }

}