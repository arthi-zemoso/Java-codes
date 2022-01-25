package chapter5;

import java.util.Locale;
import java.util.Scanner;

public class StringParser {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String fullName;
        String firstName;
        String lastName;
        System.out.println("whats your name");
        fullName= keyboard.nextLine();
        int indexOfSpace=fullName.indexOf(" ");
        firstName=fullName.toUpperCase();
        lastName=fullName.toLowerCase();
        System.out.println("first name  "+firstName+"last anme is "+lastName);
    }
}
