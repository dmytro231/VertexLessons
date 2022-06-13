package com.tsm.courses.dmytro231.lessons4;

import java.util.Arrays;

public class OddZero {
    public static void main(String[] args) {
        int[] a = {16, 3, 8, 1, 18};
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                a[i] = 0;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}