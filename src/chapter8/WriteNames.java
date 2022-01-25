package chapter8;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("ari");
        names.add("john");
        names.add("jenny");
        names.add("wendy");
        names.add("kim");
        try{
            PrintWriter pw=new PrintWriter("names.txt");
            for(String name:names)
            {
                pw.println(name);
            }
            pw.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("couldnt write to file");
        }
    }
}
