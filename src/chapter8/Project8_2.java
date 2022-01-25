package chapter8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Project8_2 {
    public static void main(String[] args) {
        ArrayList<Circle> circles;
        circles=new ArrayList<>();
        fillArrayList(circles);
        printArrayList(circles);
    }
    public static void fillArrayList(ArrayList<Circle> circles){
        Scanner infile;
        try{
            infile=new Scanner(new File("/home/arthia/IdeaProjects/Core Java/src/chapter8/circle_data.txt"));
            Circle temp;
            double radius;
            while(infile.hasNext())
            {
                radius=infile.nextDouble();
                temp=new Circle(radius);
                circles.add(temp);
            }
            infile.close();

        }
        catch(FileNotFoundException ex){
            System.out.println("file not found");
        }

    }
    public static void printArrayList(ArrayList<Circle> circles){
        PrintWriter pw;
        try{
            pw=new PrintWriter("circle_output.txt");
            for(Circle c:circles)
            {
                System.out.println("radius: "+c.getRadius());
                System.out.println("area: "+c.area());
                System.out.println("perimeter: "+c.perimeter());
                System.out.println();
                pw.println("radius: "+c.getRadius());
                pw.println("area: "+c.area());
                pw.println("perimeter: "+c.perimeter());
            }
            pw.close();

        }
        catch(FileNotFoundException ex){
            System.out.println("couldnt access file");
        }
    }
}
