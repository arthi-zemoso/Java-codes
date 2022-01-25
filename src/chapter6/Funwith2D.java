package chapter6;

import java.util.Random;

public class Funwith2D {
    public static void main(String[] args) {
        int[][] myarr=new int[3][3];
              fill2D(myarr);
    }

    public static void fill2D(int[][] twoArr) {
        Random r=new Random();
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               twoArr[i][j]=r.nextInt();
            }
        }

    }
}
