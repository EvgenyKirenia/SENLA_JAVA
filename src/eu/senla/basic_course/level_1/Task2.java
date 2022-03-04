package eu.senla.basic_course.level_1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*1)Создай 3 числовых переменных с названиями one, two, three.
	2)Запиши (присвой) переменной one число которое программа считает в консолис клавиатуры
	3)Запиши (присвой) переменной two значение one умноженное на 5
	4)Запиши (присвой) в переменную three сумму one и two
	5)Перезапиши (переприсвой) в переменную one ее же значение увеличенное на значение three и выведи значение one на экран.*/
        int one;
        int two;
        int three;


        System.out.println("Введите число: ");
        one = input.nextInt();
        two = one * 5;
        three = one + two;
        one += three; //one = one + three
        System.out.println(one);


    }
}
