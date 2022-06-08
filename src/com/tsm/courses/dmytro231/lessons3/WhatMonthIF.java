package com.tsm.courses.dmytro231.lessons3;
import java.util.Scanner;
public class WhatMonthIF {
    public static void main(String[] args) {
        System.out.print("inter to number mouth: ");
        Scanner fg = new Scanner(System.in);
        if (fg.hasNextInt()) {
            int i = fg.nextInt();
            if (i == 1) {
                System.out.println("January");
            } else if (i == 2) {
                System.out.println("February");
            } else if (i == 3) {
                System.out.println("March");
            } else if (i == 4) {
                System.out.println("April");
            } else if (i == 5) {
                System.out.println("May");
            } else if (i == 6) {
                System.out.println("June");
            } else if (i == 7) {
                System.out.println("July");
            } else if (i == 8) {
                System.out.println("August");
            } else if (i == 9) {
                System.out.println("September");
            } else if (i == 10) {
                System.out.println("October");
            } else if (i == 11) {
                System.out.println("November");
            } else if (i == 12) {
                System.out.println("December");
            } else {
                System.out.println("error, please enter a number!");
            }
        } else {
            System.out.println("error, please enter a number!");
        }
    }
}