package eu.senla.basic_course.level_2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
//13)По трем значениям размеров углов треугольника,убедиться,что такой треугольник может существовать
        Scanner input = new Scanner(System.in);
        System.out.println("Введите значение угла А");
        double A = input.nextDouble();
        System.out.println("Введите значение угла В");
        double B = input.nextDouble();
        System.out.println("Введите значение угла C");
        double C = input.nextDouble();


        boolean isSychestvyet = A > 0 && B > 0 && C > 0;
        if (isSychestvyet)
            System.out.println("Треугольник может существовать");
        else System.out.println("Угол треугольника не может быть равен 0");


    }
}
