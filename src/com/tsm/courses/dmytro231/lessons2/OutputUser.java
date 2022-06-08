package com.tsm.courses.dmytro231.lessons2;
import java.util.Scanner;
public class OutputUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter User: ");
        String user = sc.nextLine();
        System.out.println("Hello " + user +"!");
    }
}