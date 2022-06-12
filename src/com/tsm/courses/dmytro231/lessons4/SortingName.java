package com.tsm.courses.dmytro231.lessons4;

import java.util.Arrays;

public class SortingName {
    public static void main(String[] args) {
        String[] nickname = {"Petro", "Giga", "Pigul", "Air"};
        System.out.print("before sorting: ");
        System.out.println(Arrays.toString(nickname));

        Arrays.sort(nickname);
        System.out.print("after sorting: ");
        System.out.println(Arrays.toString(nickname));
    }

}
