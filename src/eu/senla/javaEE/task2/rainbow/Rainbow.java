package eu.senla.javaEE.task2.rainbow;

import java.util.Scanner;

public class Rainbow {
    public static final String RESET = "\033[0m";
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";
    public static final String YELLOW = "\033[0;33m";
    public static final String BLUE = "\033[0;34m";
    public static final String PURPLE = "\033[0;35m";
    public static final String CYAN = "\033[0;36m";
    public static String Color = "";
    public static String[] ColorArray = new String[]{"Red ", "Green ", "Yelloy ", "Blue ", "Purple ", "Cyan "};
    static Scanner input = new Scanner(System.in);

    public static void Show(Integer selectNumber) {

        if (selectNumber == 1) {

            while (true) {
                System.out.println("Enter Color Number From 1 to 6 or Enter 0 for Exit");
                int colorNumber = input.nextInt();
                switch (colorNumber) {
                    case 0:
                        System.exit(0);
                    case 1:
                        Color = ColorArray[0];
                        print(RED);
                        break;
                    case 2:
                        Color = ColorArray[1];
                        print(GREEN);
                        break;
                    case 3:
                        Color = ColorArray[2];
                        print(YELLOW);
                        break;
                    case 4:
                        Color = ColorArray[3];
                        print(BLUE);
                        break;
                    case 5:
                        Color = ColorArray[4];
                        print(PURPLE);
                        break;
                    case 6:
                        Color = ColorArray[5];
                        print(CYAN);
                        break;
                    default:
                        System.out.println("Enter correct number");
                        break;
                }
                System.out.println(RESET);
            }
        }
        else if (selectNumber == 2) {
            while (true) {
                System.out.println("Enter Color Number From 1 to 6 or Enter 0 for Exit");

                int colorNumber = input.nextInt();

                switch (colorNumber) {
                    case 0:
                        System.exit(0);
                    case 1:
                        Color = ColorArray[0];
                        print(RED);
                        Color = ColorArray[1];
                        print(GREEN);
                        break;
                    case 2:
                        Color = ColorArray[1];
                        print(GREEN);
                        Color = ColorArray[2];
                        print(YELLOW);
                        break;
                    case 3:
                        Color = ColorArray[2];
                        print(YELLOW);
                        Color = ColorArray[3];
                        print(BLUE);
                        break;
                    case 4:
                        Color = ColorArray[3];
                        print(BLUE);
                        Color = ColorArray[4];
                        print(PURPLE);
                        break;
                    case 5:
                        Color = ColorArray[4];
                        print(PURPLE);
                        Color = ColorArray[5];
                        print(CYAN);
                        break;
                    case 6:
                        Color = ColorArray[5];
                        print(CYAN);
                        Color = ColorArray[0];
                        print(RED);
                        break;
                    default:
                        System.out.println("Enter correct number");
                }
                System.out.println(RESET);
            }
        } else {
            System.out.println("Enter correct number");
        }
    }

    private static void print(String color) {
        System.out.print(color + Color);
    }
}










