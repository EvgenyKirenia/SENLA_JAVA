package javaA.task2;

public class Task2 {
    /*
    Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести  минимальное значение массива и максимальное значение массива
     */
    public static void main(String[] args) {
        int array[] = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }


}
