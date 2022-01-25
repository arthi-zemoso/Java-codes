package chapter2;

import java.util.Scanner;

public class Project2_2 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        String adjective1;
        String girlName;
        String adjective2;
        String  occupation1;
        String place;
        String clothing;
        String hobby;
        String adjective3;
        String occupation2;
        String boyName;
        String manName;

        System.out.println("enter the adjective");
        adjective1= keyboard.nextLine();
        System.out.println("enter the girls name");
        girlName= keyboard.nextLine();
        System.out.println("enter the adjective 2");
        adjective2= keyboard.nextLine();
        System.out.println("enter the occupation");
        occupation1= keyboard.nextLine();
        System.out.println("enter the place name");
        place= keyboard.nextLine();
        System.out.println("enter the clothing");
        clothing= keyboard.nextLine();
        System.out.println("enter the hobby");
        hobby= keyboard.nextLine();
        System.out.println("enter the adjective");
        adjective3= keyboard.nextLine();
        System.out.println("enter the occupation ");
        occupation2= keyboard.nextLine();
        System.out.println("enter the boy name");
        boyName= keyboard.nextLine();
        System.out.println("enter the man name");
        manName= keyboard.nextLine();
        System.out.println("THere once was a "+adjective1+"girl named "+girlName+" who was a "+adjective2+"  "+occupation1+"in the kingdom of "+place+".");
        System.out.println("She loved to wear "+clothing+" and to "+hobby+" she wanted to marry "+adjective3+" "+occupation2+" named "+boyName+" but her father king "+manName+"forbid her.");

    }
}
