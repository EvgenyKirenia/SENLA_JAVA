package eu.senla.basic_course.level_2;

public class Task2 {
    public static void main(String[] args) {
// Вывести на экран последовательность чисел 100 до 0
        int chislo = 0;

        while (chislo < 100) {

            chislo = chislo + 1;
        }

        while (chislo >= 0) {

            System.out.println(chislo);
            chislo = chislo - 1;
        }


    }
}
