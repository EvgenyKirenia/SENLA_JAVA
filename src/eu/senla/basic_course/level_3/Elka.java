package eu.senla.basic_course.level_3;

import java.util.Scanner;

public class Elka {
    public static void main(String[] args) {
/* Вывести на экран елочку из  *. Высота елки вводится пользователем с клавиатуры. Пример елочки с
	высотой в 8:
	    *
       ***
      *****
     *******
    *********
   ***********
  *************
 ***************
       ***
       ***
       ***

 */

        Scanner input = new Scanner(System.in);
        System.out.println("Vvedite visoty elki");
        int visota = input.nextInt();
        String z = "*";
        String y = " ";
        int v = 0;
        while (v < visota) {
            int j = 0;
            while (j < visota - v) {
                System.out.print(y);
                j++;
            }
            j = 0;
            while (j < 2 * v + 1) {
                System.out.print(z);
                j++;
            }
            System.out.println();
            v++;
        }
        v = 0;
        while (v < 3) {
            int h = 0;
            while (h < visota - 1) {
                System.out.print(y);
                h++;
                if (h == visota - 1) {
                    int j = 0;
                    while (j < 3) {
                        System.out.print(z);
                        j++;
                    }
                }
            }
            System.out.println();
            v++;
        }
    }
}
