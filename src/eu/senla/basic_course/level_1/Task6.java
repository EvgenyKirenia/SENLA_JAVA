package eu.senla.basic_course.level_1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
//Программа получает с клавиатуры 5 чисел, находит их сумму, и выводит пользователюстроку “Your summ = ???” - где вместо ??? должна быть подставлена суммавведенных чисел.
        Scanner input = new Scanner(System.in);
        double q, w, e, r, t;
        q = input.nextDouble();
        w = input.nextDouble();
        e = input.nextDouble();
        r = input.nextDouble();
        t = input.nextDouble();
        double summa = q + w + e + r + t;
        System.out.println("Your summ = " + summa);


    }
}
