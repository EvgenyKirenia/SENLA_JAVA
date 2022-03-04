package eu.senla.basic_course.level_3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
/* Пользователь вводит с клавиатуры последовательность в n чисел (n вводится
	с клавиатуры). Программа должна записать все введенные числа в массив.
	Вывести пользователю номера введенных им чисел которые по значению
	находятся в диапазоне от 99 до 199.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Vvedite kollichestvo chisel");
        int koll = input.nextInt();
        int[] mass = new int[koll];

        System.out.println("Vvedite  chisla");
        for (int index = 0; index < mass.length; index++) {
            mass[index] = input.nextInt();
        }

        for (int index = 0; index < mass.length; index++)
            if (mass[index] >= 99 && mass[index] <= 199) {
                System.out.println(mass[index]);
            }
    }


}

