package com.company.arrays;

import java.util.Arrays;

public class ArraysTester {
    public static void main(String[] args) {
        String[] colors = new String[7];
        colors[0] = "Violet";
        colors[1] = "Indigo";
        colors[2] = "Blue";
        colors[3] = "Green";
        colors[4] = "Yellow";
        colors[5] = "Orange";
        colors[6] = "Red";

        System.out.println(Arrays.toString(colors));
        colors[6] = "Black";
        System.out.println(Arrays.toString(colors));
        //  ArrayIndexOutOfBounds
        //  System.out.println(colors[10]);

        int[] prime = {11, 3, 7, 29, 5};

        System.out.println("Asc Order");
        for (int i = 0; i < prime.length; i++) {
            System.out.println(prime[i]);
        }

        System.out.println("Desc Order");
        for (int i = prime.length - 1; i >= 0; i--) {
            System.out.println(prime[i]);
        }

        System.out.println("Asc Order Using Enhanced For Loop");
        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println("Using Arrays stream");
        Arrays.stream(prime).forEach(System.out::println);


    }
}
