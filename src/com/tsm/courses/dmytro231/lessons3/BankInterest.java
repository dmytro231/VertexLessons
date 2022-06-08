package com.tsm.courses.dmytro231.lessons3;
import java.util.Scanner;
public class BankInterest {
    public static void main(String[] args) {
        System.out.print("enter number of months: ");
        Scanner fg = new Scanner(System.in);
        float i = fg.nextInt();
        System.out.print("enter amount: ");
        float e = fg.nextFloat();
        if (i<=12) {
            for (; i <= 12;i++) {
                float d = (e%93)*i;
                System.out.print("your charge for " + i + " months, is: " + d+"$");
            }
        }
        else {
            System.out.println("error, please enter a number!");
        }
    }
}