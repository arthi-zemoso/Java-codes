package chapter4;

import java.util.ArrayList;
import java.util.Scanner;

public class Project4_2 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        ArrayList<Double> myList=new ArrayList<>();
        double input;
        System.out.println("enter the input or -1 to exit");
        input= keyboard.nextDouble();
        while(input>=0)
        {
            myList.add(input);
            System.out.println("enter the input or -1 to exit");
            input= keyboard.nextDouble();
        }
        for(int i= myList.size()-1;i>=0;i--)
        {
            System.out.println(myList.get(i));
        }
    }


}
