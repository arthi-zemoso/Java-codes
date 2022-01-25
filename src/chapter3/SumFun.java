package chapter3;

import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
       Scanner keyboard=new Scanner(System.in);
       int sum=0,input;
        System.out.println("enter non negative integer");
        System.out.println("or negative int to exit");
        input= keyboard.nextInt();
        while(input>0)
        {
            sum+=input;
            System.out.println("enter non negative integer");
            System.out.println("or negative int to exit");
            input= keyboard.nextInt();
        }
        System.out.println("sum is "+sum);
    }
}
