package com.tsm.courses.dmytro231.lessons3;
public class MultiplicationTable {
    public static void main(String args[]) {
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 2; j <= 10; j++) {
                System.out.print(i * j + "|");
            }
        }
    }
}