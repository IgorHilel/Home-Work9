package com.igorberezovchuck;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку которую хотите записать в файл:");
        String inputString = scan.nextLine();
        System.out.println("Введите имя файла в который запишем строку (например: test):");
        String fileName = scan.nextLine();
        String fileNameFull = fileName + ".txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileNameFull))) {
            writer.write(inputString);
            System.out.println("Запись в файл успешна");
        } catch (IOException e) {
            System.out.println("Запись в файл не удалась, попробуйте снова");
        }
    }
}
