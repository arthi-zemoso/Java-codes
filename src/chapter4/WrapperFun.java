package chapter4;

import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> myAL=new ArrayList<>();
        myAL.add(10);
        myAL.add(new Integer(20));
        for(int i=0;i< myAL.size();i++)
            System.out.println(myAL.get(i));
        String value="450";
        int numericavalue=Integer.parseInt(value);
        numericavalue+=10;
        System.out.println(numericavalue);
        String str="3.142";
        double myd=Double.parseDouble(str);
        System.out.println(myd);
    }
}
