package eu.senla.basic_course.level_1;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
//По введенным метрам, вывести расстояние в километрах
        Scanner input = new Scanner(System.in);
        System.out.println("Введите расстояние в метрах");
        double metr = input.nextInt();
        double killometr = metr / 1000;
        System.out.println("Расстояние равно " + killometr + " км");


    }
}
