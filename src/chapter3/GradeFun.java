package chapter3;

import java.util.Scanner;

public class GradeFun {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        char grade;
        System.out.println("enter your grade");
        grade=keyboard.next().charAt(0);
        switch(grade){
            case 'A':
            case 'a':
                System.out.println("you did great");
                break;
            case 'B':
            case 'b':
                System.out.println("you did good");
                break;
            case 'C':
            case 'c':
                System.out.println("you did ok");
                break;
            case 'D':
            case 'd':
                System.out.println("you are learning");
                break;
            case 'F':
            case 'f':
                System.out.println("you failed");
                break;
            default:
                System.out.println("enter valid grade");
        }
    }
}
