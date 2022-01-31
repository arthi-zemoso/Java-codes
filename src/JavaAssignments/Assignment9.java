package JavaAssignments;
import java.util.*;
import java.util.regex.*;
public class Assignment9 {
    public static void findPattern(Pattern pattern,String sentence)
    {
        Matcher match=pattern.matcher(sentence);
        if(match.find())
        {
            System.out.println(sentence+" Starts with Capital letter and ends with period");
        }
        else {
            System.out.println(sentence + " doesn't Starts with Capital letter or doesn't ends with period");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the input string");
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        Pattern pattern =Pattern.compile("^[A-Z].*[.]$");
        findPattern(pattern,sentence);
    }
}
