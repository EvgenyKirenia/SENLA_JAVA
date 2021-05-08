package eu.senla.javaEE.task2;

import eu.senla.javaEE.task2.rainbow.Rainbow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 for print One color");
        System.out.println("Enter 2 for print Double color");
        while (true) {
            int selectNumber = input.nextInt();
            Rainbow.Show(selectNumber);
        }
    }
}

