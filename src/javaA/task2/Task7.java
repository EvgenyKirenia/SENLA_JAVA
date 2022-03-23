package javaA.task2;

public class Task7 {
    /*
    Дана строка:
String s = “Перестановочный алгоритм быстрого действия”;
необходимо вывести все буквы “о” из этой строки.
Для указанной строки ответ будет “ооооо” (или в столбик)
     */
    public static void main(String[] args) {
        String s = "Перестановочный алгоритм быстрого действия";
        char cont = 'о';

        for (int i = 0; i < s.length(); i++) {
            if (cont == s.charAt(i)) {
                System.out.print(cont);
            }
        }
    }
}

