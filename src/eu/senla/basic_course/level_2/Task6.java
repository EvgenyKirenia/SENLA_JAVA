package eu.senla.basic_course.level_2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
//12)по трем введенным сторонам треугольника,убедиться,что он может существовать
        Scanner input = new Scanner(System.in);
        System.out.println("Введите значение стороны АВ");
        double AB = input.nextDouble();
        System.out.println("Введите значение стороны ВC");
        double BC = input.nextDouble();
        System.out.println("Введите значение стороны CA");
        double CA = input.nextDouble();


        boolean isSychestvyet = AB > 0 && BC > 0 && CA > 0;
        if (isSychestvyet)
            System.out.println("Треугольник может существовать");
        else System.out.println("Сторона треугольника не может быть равна 0");


    }
}
