package vertex.lessons;

import java.util.Scanner;
public class ScannerNewLessons {
    public static void main(String args[]){
        System.out.print("Enter any integer from 1 to 10: ");
        Scanner any = new Scanner(System.in);
        int number = any.nextInt();
        System.out.println ("You Enter integer: " + number);


    }
}
