package eu.senla.basic_course.level_3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
//2) Написать программу, для проверки пользователя на знание таблицы
        //умножения. Пользователь вводит два целых одноразрядных числа A и B. Если
        //числа не подходят по условию, программа просит ввести хи повторно. После
        //успешного ввода, программа задает вопрос “A * B = ?”. Пользователь
        //должен ввести ответ. Программа проверяет ответ. После завершения
        //проверки, программа предлагает пользователю повторить еще один пример
        //или завершить, для этого пользователь должен ввести 1 (для продолжения)
        //или 0 (для выхода).
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Vvedte 2 chisla ot 1 do 9");
            int a = input.nextInt();
            int b = input.nextInt();
            int ravno = a * b;
            if (a >= 1 && a <= 9 && b >= 1 && b <= 9) {
                System.out.println(a + " * " + b + " = ?");
                int otvet = input.nextInt();
                if (otvet == ravno) {
                    System.out.println("Verno! " + a + " * " + b + " = " + ravno);
                    System.out.println("Dlya prodolzenia vvedi 1, dlya vixoa nazmi 0");

                    while (true) {
                        int prodolzit_vixod = input.nextInt();
                        if (prodolzit_vixod == 1) break;
                        else if (prodolzit_vixod == 0) return;
                        else {
                            System.out.println("Ne vernoe chislo!  Vvedte 1 ili 0");
                        }
                    }
                } else {
                    System.out.println("Ne verno! Pravilnyi otvet = " + ravno);
                }


            } else {
                System.out.println("Ne vernye chisla!  Vvedte 2 chisla ot 1 do 9");
            }


        }


    }
}
