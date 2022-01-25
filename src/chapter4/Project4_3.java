package chapter4;

import java.util.ArrayList;
import java.util.Scanner;

public class Project4_3 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        ArrayList<String> names=new ArrayList<>();
        ArrayList<Integer>  ages=new ArrayList<>();
        String name;
        int age;
        for(int i=0;i<5;i++)
        {
            System.out.println("enter your name");
            name= keyboard.nextLine();
            System.out.println("enter your age");
            age= keyboard.nextInt();
            keyboard.nextLine();
            names.add(name);
            ages.add(age);
            System.out.println();
        }
        for(int i=0;i< names.size();i++)
        {
            System.out.println(names.get(i)+" is "+ages.get(i)+"years old");
        }
    }
}
