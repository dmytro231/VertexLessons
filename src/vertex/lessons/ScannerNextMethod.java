package vertex.lessons;

import java.util.Scanner;
public class ScannerNextMethod {
    public static void main(String[] args){
        Scanner method = new Scanner(System.in);
        System.out.println("Enter any word or phrase: ");
        String phrase = method.next();
        System.out.println(phrase);
    }
}
