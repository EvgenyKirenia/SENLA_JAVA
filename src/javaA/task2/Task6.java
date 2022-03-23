package javaA.task2;

public class Task6 {
    /*
    Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести количество элементов в массиве
     */
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int nE = 0;
        for (int i = 0; i < array.length; i++) {
            nE = nE + array[i].length;
        }
        System.out.println(nE);
    }
}
