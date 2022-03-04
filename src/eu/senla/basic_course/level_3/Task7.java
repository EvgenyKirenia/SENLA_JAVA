package eu.senla.basic_course.level_3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
/* Вывести на экран елочку из ^ и *. * используется в верхнем и 2х нижних
	ярусах. Высота елки вводится пользователем с клавиатуры. Пример елочки с
	высотой в 8:
	*
	^^^
	^^^^^
	^^^^^^^
	^^^^^^^^^
	^^^^^^^^^^^
	***
	***
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Vvedite visoty elki");
        int visota = input.nextInt();
        String z = "*";
        String y = "^";
        String e = "";
        int v = 0;
        System.out.println(z);
        while (v < visota) {
            v = v + 1;
            e = e + y;
            System.out.println(e);
        }
        v = 0;
        while (v < 3) {
            v = v + 1;
            System.out.println(z + z + z);
        }
    }
}
