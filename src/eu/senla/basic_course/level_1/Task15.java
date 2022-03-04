package eu.senla.basic_course.level_1;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
/*Ввести с клавиатуры 2 числа и разместить их в переменных числового типа first,second.
	Ввести строку с клавиатуры и разместить ее в строковой переменной word.
	По задумке,в строку пользователь вводит название единиц с которыми работает программа(к примеру,метры,километры,шаги ит.д.).
	Программа должна суммировать введенные числа,и выводить пользователю результат строкой типа“Xminut+Yminut=Zminut”,
	где Х и Y это введенные пользователем числа,а вместо минут должнобыть введенное пользователем слово word.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Vvedite 2 chisla");
        double first = input.nextDouble();
        double second = input.nextDouble();
        System.out.println("Vvedite nazvanie");
        String word = input.next();
        double summ = first + second;
        System.out.println(first + " " + word + " + " + second + " " + word + " = " + summ + " " + word);


    }
}
