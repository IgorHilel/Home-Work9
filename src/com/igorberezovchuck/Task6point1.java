package com.igorberezovchuck;

import java.util.Arrays;

public class Task6point1 {

    public static void main(String[] args) {

        int possibleLength = 300;
        int count = 0;
        int[][] matrix = new int[3000][3];
        System.out.println(Arrays.toString(matrix));
        for (int a = 0; a < possibleLength; a++) {
            for (int b = 0; b < possibleLength; b++) {
                for (int c = 0; c < possibleLength; c++) {
                    if (a + b > c && a + c > b && c + b > a) {
                        double p = (double) (a + b + c) / 2;
                        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                        int max = 0, min = 0, middle = 0;
                        if (Math.max(a, b) == a && Math.max(a, c) == a) {
                            max = a;
                            if (Math.max(c, b) == b) {
                                middle = b;
                                min = c;
                            } else {
                                middle = c;
                                min = b;
                            }
                        } else if (Math.max(a, b) == b && Math.max(b, c) == b) {
                            max = b;
                            if (Math.max(a, c) == a) {
                                middle = a;
                                min = c;
                            } else {
                                middle = c;
                                min = a;
                            }
                        } else if (Math.max(a, c) == c && Math.max(b, c) == c) {
                            max = c;
                            if (Math.max(a, b) == a) {
                                middle = a;
                                min = b;
                            } else {
                                middle = b;
                                min = a;
                            }
                        }
                        if (area < 100) {
                            System.out.println("Треугольник существует, площадь меньше 100: " + count);
                            boolean write = true;
                            for (int i = 0; i <= count; i++) {
                                if (matrix[i][0] == min && matrix[i][1] == middle && matrix[i][2] == max) {
                                    System.out.println("Треугольник надо исключить");
                                    write = false;
                                    break;
                                }
                            }
                            if (write) {
                                matrix[count][0] = min;
                                matrix[count][1] = middle;
                                matrix[count][2] = max;
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Количество треугольников с площадью меньше 100 и которые не повторяются: " + count);
    }
}
