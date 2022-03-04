package eu.senla.basic_course.level_3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
/*Пользователь вводит с клавиатуры n чисел. Программа должна вывести
	пользователю введенную последовательность чисел в обратном порядке.
	Значение n вводится с клавиатуры.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Vvedite kolichestvo chisel");

        int chisla = input.nextInt();
        int[] mass = new int[chisla];
        int index = 0;
        System.out.println("Vvedite " + chisla + " chisel");
        while (index < chisla) {
            mass[index] = input.nextInt();
            index = index + 1;
        }

        while (index > 0) {
            index = index - 1;
            System.out.println(mass[index]);


        }


    }
}
