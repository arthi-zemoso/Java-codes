package chapter2;

import java.util.Scanner;

public class Project2_1 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        double num1,num2,num3,avg;
        System.out.println("enter three numbers");
        num1=keyboard.nextDouble();
        num2=keyboard.nextDouble();
        num3=keyboard.nextDouble();
        keyboard.nextLine();
        avg=(num1+num2+num3)/3.0;
        System.out.println("average is"+avg);
    }
}
