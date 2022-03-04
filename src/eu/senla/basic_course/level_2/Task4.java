package eu.senla.basic_course.level_2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
/*4) Вывести на экран числа в диапазоне от a до b которые делятся на 3 или на 7
    но НЕ делятся на 5. Значение a, b вводится с клавиатуры.*/
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        while (a <= b) {
            if (a % 3 == 0 || a % 7 == 0) {
                if (a % 5 != 0)
                    System.out.println(a);
            }
            a = a + 1;
        }

    }
}
