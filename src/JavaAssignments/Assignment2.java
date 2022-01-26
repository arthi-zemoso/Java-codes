 package JavaAssignments;

import java.util.Scanner;

public class Assignment2 {            //the time complexity is O(26)
    public void containsAllAlphabets(String input){
        int count=0;
        if(input.length()<26) {
            System.out.println("Doesn't contain all alphabets a-z");
            return;
        }

        String alphabet="abcdefghijklmnopqrstuvwxyz";
        for(int index=0;index<alphabet.length();index+=1)
        {
            char currentChar=alphabet.charAt(index);
            if(input.indexOf(currentChar)!=-1) {
                count++;
                continue;

            }
            else
                break;
        }
        if(count==26)
        {
            System.out.println("Contains all alphabets a-z");
        }
        else
            System.out.println("doesn't contain all alphabets a-z");

    }
    public static void main(String[] args) {
        Assignment2 object=new Assignment2();
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter your input");
        String input= keyboard.nextLine();
        object.containsAllAlphabets(input);
    }

}
