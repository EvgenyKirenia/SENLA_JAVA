package javaA.task1;

public class Task5 {
    /*
    Необходимо вывести все положительные степени числа 5 которые меньше 10000,
     вывести результат возведения в степень
     */
    public static void main(String[] args) {
        int i = 5;
        while (i < 10000){
           i = i * i;
           if (i > 10000){
               break;
           }
            System.out.println(i);
        }
    }
}
