package eu.senla.basic_course.level_1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
//Программа получает с клавиатуры 1 число, и выводит пользователю true если это числоменьше 100 и больше 20 иначе выводит false
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        double d = input.nextInt();
        boolean isResult = d < 100 && d > 20;
        System.out.println(isResult);


    }
}
