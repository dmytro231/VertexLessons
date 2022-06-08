package com.tsm.courses.dmytro231.lessons3;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        System.out.print("inter to number: ");
        Scanner fg = new Scanner(System.in);
        if (fg.hasNextInt()) {
            int i = fg.nextInt();
            if (i%2 == 0) {
                System.out.println("Even");
            }
            else {
                System.out.println("Odd");
            }
        }
        else {
            System.out.println("error, please enter a number!");
        }
    }
}