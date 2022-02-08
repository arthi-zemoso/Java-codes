 package JavaAssignments;
import java.util.*;
import java.util.Scanner;

public class Assignment2 {            //the time complexity is O(N) where n is length of string
    public boolean containsAllAlphabets(String input) {
        Map<Character, Boolean> map = new HashMap<>();
        char temp = ' ';
        int countLetter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') { // converting to lower case
                temp = (char) (input.charAt(i) + 32);
            }
            else if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z')
            {
                temp = input.charAt(i);
            }
            else { // skip character other than alphabets continue;
            }
            if (!map.containsKey(temp)) {
                map.put(temp, true);
                countLetter++;
            }
        }
        if (countLetter == 26) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Assignment2 object=new Assignment2();
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter your input");
        String input= keyboard.nextLine();
        if(object.containsAllAlphabets(input))
            System.out.println("THE GIVEN STRING HAS ALL THE LETTERS OF THE ALPHABET  IN IT");
        else
            System.out.println("THE GIVEN STRING DOES NOT HAVE ALL THE LETTERS OF THE ALPHABETS IN IT");
    }

}
