package eu.senla.basic_course.level_1;

import java.util.Scanner;

public class Task1 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
// Программа получает с клавиатуры 2 числа, и выводит пользователю сумму их квадратов
        System.out.println("Введите  2 числa: ");
        double chislo1 = input.nextDouble();
        double chislo2 = input.nextDouble();
        double summa = Math.pow(chislo1, 2) + Math.pow(chislo2, 2);
        System.out.println(summa);


    }
}
