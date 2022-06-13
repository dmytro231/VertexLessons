package com.tsm.courses.dmytro231.lessons4;

import java.util.Arrays;
import java.util.Scanner;


public class MassNn {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        if (input.hasNextInt()) {
            int t = input.nextInt();
            if (t >= 5) {
                if (t <= 10) {
                    int[] mas1 = new int[t];
                    int s = 0;

                    for (int i = 0; i < t; i++) {
                        mas1[i] = (int) (Math.random() * (t + 1));
                        if (mas1[i] % 2 == 0) {
                            s++;
                        }
                    }
                    System.out.println(Arrays.toString(mas1));
                    int[] mas2 = new int[s];
                    int x = 0;
                    for (int i = 0; i < t; i++) {
                        if (mas1[i] % 2 == 0) {
                            mas2[x] = mas1[i];
                            x++;
                        }
                    }
                    System.out.println(Arrays.toString(mas2));
                } else {
                    System.out.println("error, repeat input");
                }
            } else {
                System.out.println("error, repeat input");
            }
        } else {
            System.out.println("error, please enter a number!");
        }
    }
}









