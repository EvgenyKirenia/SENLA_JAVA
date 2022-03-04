package eu.senla.basic_course.level_1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
/*Программа вычисляет Z по математической формуле:
	 Y = -4 % 3 *(X +(2 + (8 / -2 + 15) + ( -X + 4 % 3) * 2) - 12 / 4)
	 Z = Y % 3 + -X  * 2
	 Х вводится пользователем с клавиатуры.Найденное Z нужно вывести пользователю на экран.*/
        Scanner input = new Scanner(System.in);
        double x, y, z;
        x = input.nextDouble();
        y = -4 % 3 * (x + (2 + (8 / -2 + 15) + (-x + 4 % 3) * 2) - 12 / 4);
        z = y % 3 + -x * 2;
        System.out.println(z);


    }
}
