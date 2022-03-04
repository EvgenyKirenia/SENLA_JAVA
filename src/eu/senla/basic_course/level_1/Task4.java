package eu.senla.basic_course.level_1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
//Программа получает с клавиатуры текстовую строку, и выводит пользователю строку вответ:  “You just entered ????” - где вместо ???? должна находиться строка,которую, только что, ввел пользователь.
        Scanner input = new Scanner(System.in);
        String text = input.next();
        System.out.println("You just entered " + text);


    }
}
