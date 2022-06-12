package com.tsm.courses.dmytro231.lessons4;

import java.util.Arrays;

public class Vial {
    public static void main(String[] args) {
        int[] masvial = {16, 3, 8, 1, 18};

        boolean sorting = false;
        int a;
        while (!sorting) {
            sorting = true;
            for (int i = 0; i < masvial.length - 1; i++) {
                if (masvial[i] > masvial[i + 1]) {
                    sorting = false;
                    a = masvial[i];
                    masvial[i] = masvial[i + 1];
                    masvial[i + 1] = a;
                }

            }
        }
        System.out.println(Arrays.toString(masvial));
    }
}

