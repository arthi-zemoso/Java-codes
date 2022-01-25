package chapter3;

import java.util.Random;

public class RandomFun {
    public static void main(String[] args) {
        Random random=new Random();
        int randomNumber;
        randomNumber=random.nextInt();
        System.out.println("number is "+randomNumber);
        randomNumber=random.nextInt(1000);
        System.out.println("no in 0-999 "+randomNumber);
        randomNumber=random.nextInt(1000)+1;
        System.out.println("no in 1-1000"+randomNumber);
    }
}
