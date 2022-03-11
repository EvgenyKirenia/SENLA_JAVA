package javaA.task1;

public class Task6 {
    /*
    Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
Реализовать 2 варианта:

использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
без использования конструкции if (шаг цикла на ваше усмотрение).
     */
    public static void main(String[] args) {

        int a = 40;
        int b = 60;
        int c = 4;
        for (int i = a; i <= b; i++) {
            if (i % 4 == 0){
                System.out.println(i);
            }
        }
        System.out.println("----------------------");
        for (int i = a; i <= b ; i = i + c) {
            System.out.println(i);



        }
    }
}
