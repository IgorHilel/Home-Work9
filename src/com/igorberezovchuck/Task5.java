package com.igorberezovchuck;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {

    private static final int LENGTH_ARRAY = 10;

    public static void main(String[] args) {

        int[] array = new int[LENGTH_ARRAY];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        insertSort(array);
        System.out.println(Arrays.toString(array));

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число которое необходимо проверить:");
        int number = scan.nextInt();

        boolean result = isNumber(array, number);
        System.out.println(result);

    }

    private static boolean isNumber(int[] array, int number) {
        int left = 0;
        int right = array.length;
        while (!(left >= right)) {
            int mid = left + (right - left) / 2;
            if (array[mid] == number) {
                return true;
            }
            if (array[mid] > number) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    private static void insertSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }
}




