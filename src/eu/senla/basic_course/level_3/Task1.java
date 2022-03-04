package eu.senla.basic_course.level_3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
/*13)Написать программу для ателье учитывающую расход ткани. При запуске
	программы, пользователь вводит общий размер имеющейся ткани. Дальше
	пользователь последовательно вводит размеры кусков которые нужно
	отрезать. Программа, при каждом “отрезе”, должна выводить количество
	оставшейся ткани. Если пользователь пытается отрезать больше чем ткани
	есть - программа предупреждает его об этом. Если запрашиваемый отрез
	меньше 1 - программа тоже предупреждает, что отрезать так мало не
	получится. Программа завершается когда закончена вся ткань.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер ткани:");
        double razmer = input.nextDouble();

        double ostatok = razmer;
        while (ostatok >= 1) {
            System.out.println("Сколько отрезать:");
            double otrez = input.nextDouble();

            if (otrez >= 1 && otrez <= ostatok) {
                ostatok = ostatok - otrez;
                System.out.println("Осталось ткани: " + ostatok);
            } else if (otrez < 1) {
                System.out.println("Отрез не может быть меньше 1");
            } else if (otrez > ostatok) {
                System.out.println("Отрез больше чем осталось ткани");
            }


        }
        System.out.println("Ткань закончилась");


    }
}
