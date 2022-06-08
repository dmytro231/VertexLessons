package com.tsm.courses.dmytro231.lessons3;
import java.util.Scanner;
public class WhatMonth {
    public static void main(String[] args) {
        System.out.print("inter to number mouth: ");
        Scanner fg = new Scanner(System.in);
        if (fg.hasNextInt()) {
            int i = fg.nextInt();
            switch (i) {

                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("error, please enter a number month!");
            }
        } else {
            System.out.println("error, please enter a number!");
        }
    }
}