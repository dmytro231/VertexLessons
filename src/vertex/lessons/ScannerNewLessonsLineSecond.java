package vertex.lessons;

import java.util.Scanner;
public class ScannerNewLessonsLineSecond {
    public static void main(String[] args){
        Scanner two = new Scanner(System.in);
        System.out.println("Enter to any two phrase: ");
        String phrase1 = two.nextLine();
        String phrase2 = two.nextLine();
        System.out.println(phrase1 +" " + phrase2);
    }
}
