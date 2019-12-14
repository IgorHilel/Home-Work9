package com.igorberezovchuck;

import java.util.Arrays;
import java.util.Random;

public class Task1 {

    public final static int LENGTH_ARRAY = 10;

    public static void main(String[] args) {
        int[] array = new int[LENGTH_ARRAY];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        sortArray(array, SortType.BUBBLE);
        System.out.println("Sort array: " + Arrays.toString(array));
    }

    public static void sortArray(int[] array, SortType type) {
        switch (type) {
            case BUBBLE:
                System.out.println("BUBBLE sort");
                bubbleSort(array);
                break;
            case INSERT:
                System.out.println("INSERT sort");
                insertSort(array);
                break;
            case SELECT:
                System.out.println("SELECT sort");
                selectionSort(array);
                break;
        }
    }

    private static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
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

    private static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
