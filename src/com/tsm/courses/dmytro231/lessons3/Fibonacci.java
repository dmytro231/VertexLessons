package com.tsm.courses.dmytro231.lessons3;
public class Fibonacci {
    public static void main(String[] args){
        int i1 = 1, i2 = 1,i3;
        System.out.print(i1+" "+i2+" ");
        for(int i = 3; i <= 11; i++){
            i3=i1+i2;
            i1=i2;
            i2=i3;
            System.out.print(i3+" ");
        }
    }
}