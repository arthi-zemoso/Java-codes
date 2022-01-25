package chapter3;

import java.util.Scanner;

public class Project3_2 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int input;
        System.out.println("enter your input");
        input= keyboard.nextInt();
        if(input%3==0)
        {
            System.out.println("divisibible by 3");

        }
        else
            System.out.println("not divisible by 3");
    }
}
