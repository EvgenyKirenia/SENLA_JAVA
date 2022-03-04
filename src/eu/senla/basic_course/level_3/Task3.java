package eu.senla.basic_course.level_3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
/*15)Пользователь вводит с клавиатуры n чисел (n вводится с клавиатуры).
	Программа должна выбрать из них самое большое и самое маленькое из
	введенных и вывести на экран.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Vvedite kolichestvo chisel");

        int chisla = input.nextInt();
        int[] mas = new int[chisla];
        int index = 0;
        System.out.println("Vvedite " + chisla + " chisel");
        while (index < chisla) {
            mas[index] = input.nextInt();
            index = index + 1;
        }
        int max = mas[0];
        int min = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] > max) max = mas[i];
            if (mas[i] < min) min = mas[i];


        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

    }
}
