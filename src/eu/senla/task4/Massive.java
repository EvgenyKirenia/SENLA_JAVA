package eu.senla.task4;

import java.text.DecimalFormat;

public class Massive {


    public static void main(String[] args) {
        int stringLenght = 6;
        DecimalFormat decimalFormat = new DecimalFormat("###.#####");
        double number = Math.random() * 10 + 1;
        String randomNumber = decimalFormat.format(number);
        String[][] massive = new String[10][10];


        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                if (j % 3 == 0) {
                    massive[i][j] = randomNumber;
                }

            else
                {
                massive[i][j] = Massive.getLetter(stringLenght);



            }System.out.print(massive[i][j] + " ");
                }
            System.out.println();

        }}



    static String getLetter(int stringLenght) {
        String letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder stringBuilder = new StringBuilder(stringLenght);
        for (int i = 0; i < stringLenght; i++) {
            int index = (int) (letter.length() * Math.random());
            stringBuilder.append(letter.charAt(index));
        }
        return stringBuilder.toString();
    }


}


