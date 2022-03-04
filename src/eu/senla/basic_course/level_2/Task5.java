package eu.senla.basic_course.level_2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
/*Написать программу которая может бесконечно считывать введенные
	пользователем числа и выводить их квадрат. Сигналом к завершению
	программы должно служить введения числа -1.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Vvedite chislo");
        int kvadrat;

        while (true) {

            int chislo = input.nextInt();
            System.out.println("Vvedite sled chislo, ili vvedite '-1' dlya vixoda");
            kvadrat = (int) Math.pow(chislo, 2);
            if (chislo == -1) break;
            System.out.println(kvadrat);
        }
        System.out.println("Programma Finished");


    }
}
