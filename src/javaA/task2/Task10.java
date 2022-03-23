package javaA.task2;

public class Task10 {
    /*
    Дан массив:
String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
     */
    public static void main(String[] args) {
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        String cont = "е";
        int numWithoutE = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!array[i][j].contains(cont)){
                    numWithoutE ++;
                }
            }
        }
        System.out.println(numWithoutE);
    }
}
