package eu.senla.basic_course.level_3;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
/*Написать полноценную консольную программу калькулятора, поддерживающую следующие мат. действия:+ - * / %.
        Программа должна предоставлять хороший диалог с пользователем.Принцип работы калькулятора:
         a) пользователь вводит число
         b) пользователь вводит знак действия
         c) пользователь опять вводит число
         d)действие подсчитывается и выводится результат
         e) дальше пользователь может сразу ввести знак,
         что будет значить что нужно делать действие с предыдущим результатом вместо первого аргумента,
         или число,что будет значить,что результат сбрасывается и программа выполняется опять с пункта а)
          f) пользователь влюбой момент может написать слово off,что приведет к немедленному завершению программы
          g) пользователь может в любой момент написать слово CE что приведет программу к пункту а. */

        Scanner input = new Scanner(System.in);

        System.out.println("Vas privetstvyet Kalculator");
        char plus = '+';
        char minus = '-';
        char ymnozit = '*';
        char delit = '/';
        char ostatok = '%';

        double result = 0;


        while (true) {
            System.out.println("Vvedite chiclo");

            String in = input.next();
            if (toContinue(in)) continue;
            double chislo1 = Double.parseDouble(in);

            System.out.println("Vvedite deistvie(+ - * / %)");
            in = input.next();
            if (toContinue(in)) continue;
            char znak = in.charAt(0);

            System.out.println("Vvedite sledyushee chislo");
            in = input.next();
            if (toContinue(in)) continue;
            double chislo2 = Double.parseDouble(in);

            while (true) {


                if (znak == plus)
                    result = chislo1 + chislo2;


                if (znak == minus)
                    result = chislo1 - chislo2;


                if (znak == ymnozit)
                    result = chislo1 * chislo2;


                if (znak == delit)
                    result = chislo1 / chislo2;


                if (znak == ostatok)
                    result = chislo1 % chislo2;

                System.out.println(result);

                System.out.println("Vvedite deistvie(+ - * / %)");
                in = input.next();
                if (toContinue(in)) break;
                znak = in.charAt(0);

                if (znak == plus || znak == minus || znak == ymnozit || znak == delit || znak == ostatok) {
                    chislo1 = result;
                    System.out.println("Vvedite sledyushee chislo");
                    chislo2 = input.nextDouble();
                } else break;
            }
        }
    }

    public static boolean toContinue(String input) {
        String in = input.strip();
        if (in.equals("off"))
            System.exit(0);
        return in.equals("CE");
    }
}

