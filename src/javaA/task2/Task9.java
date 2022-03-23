package javaA.task2;

public class Task9 {
    /*
    Дана строка:
String s = “Посмотрите как Рите нравится ритм”;
необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
Для указанной строки ответ будет 6, 15, 29.
     */
    public static void main(String[] args) {
        String s = "Посмотрите как Рите нравится ритм";
        s = s.toLowerCase();
        String subStr = "рит";
        int i = s.indexOf(subStr);

            while (i != -1){
            System.out.println(i);
            i = s.indexOf(subStr,i + 1);
            }



    }
}
