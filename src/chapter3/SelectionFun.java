package chapter3;

import java.util.Scanner;

public class SelectionFun {
    public static void main(String[] args) {
        int age;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("welcome to pub n grill");
        System.out.println("enter your age");
        age=keyboard.nextInt();
        if(age>=21)
            System.out.println("enjoy your beer");
        else if(age>=16)
        {
            System.out.println("have a coke");
            System.out.println("you can atleast drive");
        }
        else
            System.out.println("have a coke!");
        System.out.println("thx for coming");
    }
}
