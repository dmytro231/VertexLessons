package vertex.lessons;

import java.util.Scanner;
public class ScannerNewLessonsLine {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        System.out.println("Enter any word or phrase: ");
        String phrasel = line.nextLine();
        System.out.println("You enter: " + phrasel);
    }
}
