package com.tsm.courses.dmytro231.lessons2;
import java.util.Scanner;
public class SolveEquation {
    public static void main(String[] args) {
        int a, b, c;
        double D;
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("enter  a, b, c: ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        int f = 2;
        D = Math.pow(b, 2) - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("roots: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("root: x = " + x);
        } else {
            System.out.println("no roots");
        }
    }
}