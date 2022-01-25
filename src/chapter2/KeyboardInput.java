package chapter2;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        String name,city;
        int age;
        double dubinput;
        System.out.println("Whats your name");
        name=keyboard.nextLine();
        System.out.println("whats your age");
        age=keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("whats your real number");
        dubinput=keyboard.nextDouble();
        keyboard.nextLine();
        dubinput*=2;
        System.out.println("what city do you live in");
        city=keyboard.nextLine();
        System.out.println("hello"+name);
        System.out.println("age is"+age);
        System.out.println("city is"+city);
        System.out.println("real number is"+dubinput);
    }
}
