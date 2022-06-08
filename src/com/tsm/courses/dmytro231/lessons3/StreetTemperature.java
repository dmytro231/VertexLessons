package com.tsm.courses.dmytro231.lessons3;
import java.util.Scanner;
public class StreetTemperature {
    public static void main(String[] args) {

        System.out.print("inter which outside temperature ℃: ");
        Scanner fg = new Scanner(System.in);
        if (fg.hasNextInt()) {
            int t = fg.nextInt();
            if (t >= -5) {
                System.out.println("Warm!");
            } else if (t > -20) {
                System.out.println("Normal!");
            } else if (t < -20) {
                System.out.println("Cold");
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error, please enter a number!");
        }
    }
}