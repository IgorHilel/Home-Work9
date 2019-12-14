package com.igorberezovchuck;

public class Task6 {

    public static void main(String[] args) {

        int possibleLength = 300;
        int count = 0;
        for (int a = 0; a < possibleLength; a++) {
            for (int b = 0; b < possibleLength; b++) {
                for (int c = 0; c < possibleLength; c++) {
                    if (a + b > c && a + c > b && c + b > a) {
                        System.out.println("Треугольник существует: " + count);
                        double p = (double) (a + b + c) / 2;
                        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                        if (area < 100) {
                            count++;
                        }
                        System.out.println("Площадь: " + area + " стороны: " + " a: " + a + " b: " + b + " c: " + c);
                    }
                }
            }
        }
        System.out.println("Количество треугольников с площадью меньше 100: " + count);
    }
}
