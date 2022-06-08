package com.tsm.courses.dmytro231.lessons2;
import java.util.Scanner;
public class AssignmentSubtraction {
    public static void main(String[] args) {
        System.out.println("a+b");
        System.out.print("enter a: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.print("enter b: ");
        int b = scan.nextInt();
        System.out.println ("a+b="+(a+b));
        System.out.println("a-b");
        System.out.print("enter a: ");
        Scanner scan7 = new Scanner(System.in);
        int t = scan7.nextInt();
        System.out.print("enter b: ");
        int g = scan7.nextInt();
        System.out.println ("a-b="+(t-g));

    }
}