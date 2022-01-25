package chapter4;

import java.util.Scanner;

public class Project4_1 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int[] myarray;
        myarray=new int[5];
        for(int i=0;i< myarray.length;i++)
        {
            System.out.println("enter an integer");
            myarray[i]= keyboard.nextInt();
        }
        for(int i=0;i< myarray.length;i++)
        {
            int result=myarray[i]*2;
            System.out.println("result is"+result);
        }
    }
}
