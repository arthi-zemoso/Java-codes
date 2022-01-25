package chapter6;

import java.util.ArrayList;

public class Project6_1 {
    public static void main(String[] args) {
        ArrayList<Integer> mylist=new ArrayList<>();
        mylist.add(10);
        mylist.add(20);
        mylist.add(30);
        mylist.add(40);
        int sum=sumElements(mylist);
        System.out.println(sum);
    }
    public static int sumElements(ArrayList<Integer> list)
    {
        int sum=0;
        for(int i=0;i<list.size();i++)
        {
            sum+=list.get(i);
        }
        return sum;
    }
}
