package com.igorberezovchuck;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

    public final static int LENGTH_ARRAY = 10;

    public static void main(String[] args) {
        int[] array = new int[LENGTH_ARRAY];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        int countLeft = 0, evenNum = 0, sum = 0, lessAverage = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        int average = sum / array.length;
        for (int i = (array.length - 1); i >= 0; i--) {
            if (array[i] % 2 == 0) {
                evenNum++;
            }
            if (array[i] < average) {
                lessAverage++;
            }
            if (i != 0 && array[i] > array[i - 1]) {
                countLeft++;
            }
        }
        System.out.println("Количество элементов в массиве, которые больше своего соседа слева: " + countLeft);
        System.out.println("Количество чётных элементов в массиве: " + evenNum);
        System.out.println("Количество элементов в массиве меньше чем среднее арифметическое массива: " + lessAverage);
    }
}
