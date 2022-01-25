package chapter8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project8_1 {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles;
        rectangles=new ArrayList<>();
        fillArrayList(rectangles);
        printArrayList(rectangles);
    }
    public static void fillArrayList(ArrayList<Rectangle> rectangle){
        Scanner infile;
        try{
            infile=new Scanner(new File("/home/arthia/IdeaProjects/Core Java/src/chapter8/rectangle_data.txt"));
            Rectangle temp;
            double length,width;
            while(infile.hasNext())
            {
                length=infile.nextDouble();
                width=infile.nextDouble();
                temp=new Rectangle(length,width);
                rectangle.add(temp);
            }
            infile.close();

        }
        catch(FileNotFoundException ex){
            System.out.println("file not found");
        }

    }
    public static void printArrayList(ArrayList<Rectangle> rectangles){
        for(Rectangle r:rectangles)
        {
            System.out.println("length: "+r.getLength());
            System.out.println("width: "+r.getWidth());
            System.out.println("area: "+r.area());
        }
    }
}
