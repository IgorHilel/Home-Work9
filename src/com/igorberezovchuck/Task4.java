package com.igorberezovchuck;

import java.util.Arrays;
import java.util.Random;

public class Task4 {

    private static final int LENGTH_ARRAY = 5;

    public static void main(String[] args) {
        int[] array = new int[LENGTH_ARRAY];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        int n = 4;
        int[] newArray = new int[LENGTH_ARRAY * n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < array.length; j++) {
                newArray[i * LENGTH_ARRAY + j] = array[j];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
