 package JavaAssignments;
import java.util.*;
import java.util.Scanner;

public class Assignment2 {            //the time complexity is O(1)
    public boolean containsAllAlphabets(String input){
        HashMap<Character, Integer> map = new HashMap<>() ;     //Using a hashmap for counting the characters.
        int count = 0 ;
        for(int i = 0; i<input.length() ; i++)
        {
            count++ ;
            if(map.containsKey(input.charAt(i)))
                map.put(input.charAt(i) , map.get(input.charAt(i)) + 1) ;
            else
                map.put(input.charAt(i) , 1) ;
        }
        for(char ch = 97 ; ch <=122 ;ch++ )
            if(map.get(ch) == null)             //If any lowercase character didnt occur , return false
                return false;
        return true ;
    }
    public static void main(String[] args) {
        Assignment2 object=new Assignment2();
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter your input");
        String input= keyboard.nextLine();
        if(object.containsAllAlphabets(input))
            System.out.println("THE GIVEN STRING HAS ALL THE LOWER CASE CHARACTERS IN IT");
        else
            System.out.println("THE GIVEN STRING DOES NOT HAVE ALL THE LOWER CASE CHARACTERS IN IT");
    }

}
