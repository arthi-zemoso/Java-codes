package chapter4;

public class ArrayFun {
    public static void main(String[] args) {
        int[] myarray;
        myarray=new int[5];
        myarray[0]=1;
        myarray[1]=20;
        myarray[2]=22;
        myarray[3]=10;
        myarray[4]=40;

        for(int num:myarray)
        {
            System.out.println(num);
        }


    }
}

