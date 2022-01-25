package chapter3;

import java.util.Scanner;

public class Project3_1 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int packageNo;
        int baseCost;
        int howMany;
        int costPerCourse;
        int numIncluded;
        int totalCost;
        System.out.println("which package do you want 1,2,3");
        packageNo=keyboard.nextInt();
        System.out.println("how many courses");
        howMany=keyboard.nextInt();
        if(packageNo==1)
        {
            baseCost=10;
            costPerCourse=6;
            numIncluded=2;
        }
        else if(packageNo==2)
        {
            baseCost=12;
            costPerCourse=4;
            numIncluded=4;
        }
        else
        {
            baseCost=15;
            costPerCourse=3;
            numIncluded=6;
        }
        if(howMany>numIncluded)
        {
           totalCost=baseCost+(howMany-numIncluded)*costPerCourse;
        }
        else
        {
            totalCost=baseCost;
        }
        System.out.println("total cost is "+totalCost);

    }



}
