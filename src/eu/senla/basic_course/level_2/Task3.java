package eu.senla.basic_course.level_2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
// Вывести на экран все четные числа которые в диапазоне от a до b. Значение a, b вводится с клавиатуры.
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        while (a <= b) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a = a + 1;
        }


    }
}
