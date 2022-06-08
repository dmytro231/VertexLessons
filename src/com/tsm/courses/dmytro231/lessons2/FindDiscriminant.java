package com.tsm.courses.dmytro231.lessons2;
import java.util.Scanner;
public class FindDiscriminant {
    public static void main(String[] args) {
        int a, b, c;
        double D;
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("enter  a, b, c: ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        D = Math.pow(b, 2) - 4 * a * c;
        System.out.println("D=" + Math.round(D));
    }
}