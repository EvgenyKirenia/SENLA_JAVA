package javaA.task2;

public class Task8 {
    /*
    Дана строка:
String s = “Перевыборы выбранного президента”;
необходимо подсчитать количество букв “е” в строке.
Для указанной строки ответ будет 4.
     */
    public static void main(String[] args) {
        String s = "Перевыборы выбранного президента";
        char cont = 'е';
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == cont){
                num++;
            }
        }
        System.out.println(num);
    }
}
