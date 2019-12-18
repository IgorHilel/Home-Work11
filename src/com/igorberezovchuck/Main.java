package com.igorberezovchuck;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person[] students = new Person[100];
        for (int i = 0; i < students.length ; i++) {
            Person student = new Person();
            students[i] = student;
        }
        System.out.println(Arrays.toString(students));
    }
}
