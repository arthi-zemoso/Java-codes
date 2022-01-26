package JavaAssignments;
import java.io.File;
import java.util.Scanner;
import java.util.regex.*;

public class Assignment1 {
    private static final String REGEX__JAVA_FILES=".*(.java)$";
    private static final String REGEX_TEXT_FILES=".*(.txt)$";
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        String input;
        while(true)
        {
            System.out.println("enter the file name or exit to leave");
            input= keyboard.nextLine();
            if (input.equals("exit"))
                break;
            File userDirectory = new File("/home/arthia/IdeaProjects/Core Java/src/chapter8");
            File Filelist[] = userDirectory.listFiles();
            Pattern pattern=Pattern.compile(input);
            System.out.println("Java files are as follows");
            for(File file:Filelist)
            {
                Matcher matcher= pattern.matcher(file.getName());
                if(matcher.matches())
                {

                    System.out.println(input+" path is "+file.getAbsolutePath());
                    System.out.println();
                    break;

                }
                else{
                    System.out.println("file not found");
                    break;
                }

            }


            }
        }
    }

