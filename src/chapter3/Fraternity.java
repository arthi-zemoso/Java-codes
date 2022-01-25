package chapter3;

import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        char gender;
        int age;
        System.out.println("enter your age");
        age=keyboard.nextInt();
        System.out.println("enter your grade");
        gender=keyboard.next().charAt(0);
        if(age>=19 && gender=='M')
            System.out.println("you can join fraternity");
        else
            System.out.println("you cannot join");

    }
}
