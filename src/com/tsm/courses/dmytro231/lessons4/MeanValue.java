package com.tsm.courses.dmytro231.lessons4;

import java.util.Arrays;

public class MeanValue {
    public static void main(String[] args) {
        int[] a = {16, 3, 8, 1, 18};
        int[] b = {11, 4, 8, 10, 8};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        double amass = 0;
        double bmass = 0;

        for (int i = 0; i < 5; i++) {
            amass += a[i];
            bmass += b[i];
        }
        amass /= 5;
        bmass /= 5;

        if (amass > bmass) {
            System.out.println("arithmetic mean of the first array (" + amass + ") greater than the second array " +
                    "(" + bmass + ")");
        } else {
            System.out.println("the arithmetic mean values of the arrays are (" + amass + ")");
        }

    }
}
