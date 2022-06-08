package com.tsm.courses.dmytro231.lessons3;
import java.util.Scanner;
public class Rainbow {
    public static void main(String[] args) {
        System.out.print("inter to number colors: ");
        Scanner color = new Scanner(System.in);
        if (color.hasNextInt()) {
            int i = color.nextInt();
            switch (i) {

                case 1:
                    System.out.println("Red");
                    break;
                case 2:
                    System.out.println("Orange");
                    break;
                case 3:
                    System.out.println("Yellow");
                    break;
                case 4:
                    System.out.println("Green");
                    break;
                case 5:
                    System.out.println("Blue");
                    break;
                case 6:
                    System.out.println("Indigo");
                    break;
                case 7:
                    System.out.println("Violet");
                    break;
                default:
                    System.out.println("error, please enter a number colors!");
            }
        }
        else {
            System.out.println("error, please enter a number!");
        }
    }
}