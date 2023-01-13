package vertex.lessons2;

import java.util.Scanner;
public class Calculator {
    static Scanner ska = new Scanner(System.in);
    public static void main(String[] args){
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("Result operation: " + result);
    }
    public static int getInt() {
        System.out.println("Enter to integer: ");
        int num;
        if (ska.hasNextInt()) {
            num = ska.nextInt();
        } else {
            System.out.println(" You made mistake at enter integer. Try again! ");
            ska.next();
            num = getInt();
        }
        return num;
    }
    public static char getOperation(){
        System.out.println ("Enter operation: ");
        char operation;
        if (ska.hasNext()){
            operation = ska.next() .charAt(0);
        } else {
            System.out.println(" You made mistake at enter operation. Try again! ");
            ska.next();
            operation = getOperation();
        }
        return operation;
    }
     public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Operation not recognized. Try again to enter!");
                result = calc(num1, num2,getOperation());
        }
        return result;
     }

    }


