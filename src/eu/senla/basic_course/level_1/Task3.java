package eu.senla.basic_course.level_1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
// Программа получает  с клавиатуры 2 числа - делимое и делитель, и выводит пользователю остаток деления делимого на делитель
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        double delimoe = input.nextInt();
        double delitel = input.nextInt();
        double del = delimoe % delitel;
        System.out.println("Delenie = " + del);


    }
}
