package eu.senla.basic_course.level_1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
/* Программа вычисляет Z по математической формуле:
	Y = X + 4 % 3 - X + (11 - 2 / 2 * 0 -(X * -1)) >= X
	Z =  !(X <= 3 && Y == false ) || X >= 3
	Х вводится пользователем с клавиатуры.Найденное Z нужно вывести пользователю на экран.*/
        Scanner input = new Scanner(System.in);
        double X;
        boolean Y;
        boolean Z;
        X = input.nextDouble();
        Y = X + 4 % 3 - X + (11 - 2 / 2 * 0 - (X * -1)) >= X;
        Z = !(X <= 3 && Y == false) || X >= 3;
        System.out.println(Z);


    }
}
