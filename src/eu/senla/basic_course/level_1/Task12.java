package eu.senla.basic_course.level_1;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
/*Ввести с клавиатуры 5 слов и разместить их в переменных строкового типа с любым названием.
	Вывести пользователю строку объединяющую все введенные слова разделенные пробелом.*/
        Scanner input = new Scanner(System.in);
        String q, w, e, r, t;
        q = input.next();
        w = input.next();
        e = input.next();
        r = input.next();
        t = input.next();
        System.out.println(q + " " + w + " " + e + " " + r + " " + t);


    }
}
