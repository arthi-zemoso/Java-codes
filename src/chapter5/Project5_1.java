package chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class Project5_1 {
    public static void main(String[] args) {
        ArrayList<String> firstnames=new ArrayList<>();
        ArrayList<String> lastnames=new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        String fullName;
        String firstName;
        String lastName;
        int index;
        final int NUM_NAMES=5;
        for(int i=0;i<NUM_NAMES;i++)
        {
            System.out.println("whats your name");
            fullName= keyboard.nextLine();
            index=fullName.indexOf(" ");
            firstName=fullName.substring(0,index);
            lastName=fullName.substring(index+1);
            firstnames.add(firstName);
            lastnames.add(lastName);

        }
        for(int i=0;i< firstnames.size();i++)
        {
            for(int j=0;j<lastnames.size();j++)
            {
                System.out.println(firstnames.get(i)+ " "+ lastnames.get(j));
            }
        }
    }
}
