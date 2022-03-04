package eu.senla.basic_course.level_3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
/* Вывести на экран треугольник из звездочек с заданной с клавиатуры
	высотой. Пример с высотой 5:
	*
	**
	***
	****
	*****
		*/
        Scanner input = new Scanner(System.in);
        System.out.println("Vvedite visoty elki");
        int visota = input.nextInt();
        String z = "";
        int v = 0;
        while (v < visota) {
            v = v + 1;
            z = z + "*";
            System.out.println(z);
        }
    }
}
