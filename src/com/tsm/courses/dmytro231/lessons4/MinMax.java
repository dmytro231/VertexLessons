package com.tsm.courses.dmytro231.lessons4;

import java.util.Scanner;
import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        if (input.hasNextInt()) {
            int t = input.nextInt();
            int[] mas = new int[t];
            for (int i = 0; i < t; i++) {
                mas[i] = (int) (Math.random() * (t + 1));
                System.out.println(Arrays.toString(mas));
                int max = mas[0];
                int min = mas[0];
                double avg = 0;
                for ( i = 0; i < mas.length; i++) {
                    if(max < mas[i])
                        max = mas[i];
                    if(min > mas[i])
                        min = mas[i];
                    avg += mas[i]/mas.length;
                }

                System.out.println("max = " + max);
                System.out.println("min = " + min);
                System.out.println("avg = " + avg);
            }
        } else {
            System.out.println("error, please enter a number!");
        }

    }
}

