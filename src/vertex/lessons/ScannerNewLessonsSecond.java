package vertex.lessons;

import java.util.Scanner;
public class ScannerNewLessonsSecond {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        System.out.println ("Enter 2 any integers: ");
        int number1 = k.nextInt();
        int number2 = k.nextInt();
        System.out.print(number1 + number2);
    }
}
