package eu.senla.basic_course.level_1;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
/*Ввести с клавиатуры5 чисели разместить их в переменных числового типа a,b,c,d,e.
	Программа должна вывести пользователю true,если остаток от деления суммы всех введенных чисел на значение переменной а,больше нуля но меньше половины а.
	В противном случае вывести false.*/
        Scanner input = new Scanner(System.in);
        double a, b, c, d, e;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        double ostatok = (a + b + c + d + e) % a;
        boolean isBolshe = ostatok > 0 && ostatok < a / 2;

        System.out.println(isBolshe);


    }
}
