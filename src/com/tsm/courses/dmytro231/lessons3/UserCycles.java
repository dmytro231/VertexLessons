package com.tsm.courses.dmytro231.lessons3;
import java.util.Scanner;
public class UserCycles {
    public static void main(String[] args) {
        System.out.print("inter to number: ");
        Scanner fg = new Scanner(System.in);
        if (fg.hasNextInt()) {
            int b = fg.nextInt();
            if (b >= 1) {
                for (int i = 1; i <= b; i++) {
                    System.out.print(i + " ");
                }
            } else if (b <= 0) {
                System.out.println("error, please enter a number!");
            } else {
                System.out.println("error, please enter a number!");
            }
        } else {
            System.out.println("error, please enter a number!");
        }
    }
}

