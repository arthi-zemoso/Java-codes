package chapter8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInputFun {
    public static void main(String[] args) {
        Scanner infile;
        try{
            infile=new Scanner(new File("input.txt"));
            int input;
            int sum=0;
            while ((infile.hasNext()))
            {
                input=infile.nextInt();
                 sum+=input;
                System.out.println(input);
            }
            System.out.println(sum);
            infile.close();

        }
        catch(FileNotFoundException ex){

            System.out.println("cant find file");
            System.out.println(ex.getMessage());
        }

    }
}
