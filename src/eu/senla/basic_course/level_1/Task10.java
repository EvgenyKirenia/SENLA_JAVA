package eu.senla.basic_course.level_1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
/*Программа вычисляет Z по математической формуле:
	Y =  -X + 4 % 3 * 2 - 12 / 4 + (X +(2 + (8 / -2 + 15)))
	Z = !(Y > 100) || X > 100 && Y > 100
	Х вводится пользователем с клавиатуры.Найденное Z нужно вывести пользователю на экран.*/
        Scanner input = new Scanner(System.in);
        double X;
        double Y;
        boolean Z;
        X = input.nextDouble();
        Y = -X + 4 % 3 * 2 - 12 / 4 + (X + (2 + (8 / -2 + 15)));
        Z = !(Y > 100) || X > 100 && Y > 100;
        System.out.println(Z);


    }
}
