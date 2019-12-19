package com.igorberezovchuck;

import java.util.Arrays;

public class Main {

    private static final int PERSON_COUNTS = 100;

    public static void main(String[] args) {
        Person[] people = PersonFactory.createRandomList(PERSON_COUNTS);
        System.out.println(Arrays.toString(people));
    }
}
