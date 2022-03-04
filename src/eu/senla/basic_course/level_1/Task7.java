package eu.senla.basic_course.level_1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
//Программа получает с клавиатуры 5 чисел, и выводит пользователю true если ихумножение больше либо равно их их сумме, и false если меньше.
        Scanner input = new Scanner(System.in);
        double q, w, e, r, t;
        q = input.nextDouble();
        w = input.nextDouble();
        e = input.nextDouble();
        r = input.nextDouble();
        t = input.nextDouble();
        double summa = q + w + e + r + t;
        double ymnog = q * w * e * r * t;
        boolean isBolshe = ymnog >= summa;
        System.out.println(isBolshe);


    }
}
