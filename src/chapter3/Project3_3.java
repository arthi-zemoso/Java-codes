package chapter3;

import java.util.Random;
import java.util.Scanner;

public class Project3_3 {
    public static void main(String[] args) {
        int guess;
        int count=0;
        int computerNo;
        Random random=new Random();
        boolean guessedno=false;
        Scanner keyboard=new Scanner(System.in);
        computerNo=random.nextInt(100)+1;
        while(!guessedno)
        {
            System.out.println("enter your guess");
            guess= keyboard.nextInt();
            count++;
            if(guess>=1 &&guess<=100)
            {
                if(guess==computerNo)
                {
                    System.out.println("congraats");
                    guessedno=true;
                }
                else if(guess>computerNo)
                {
                    System.out.println("guess is higher");
                }
                else
                {
                    System.out.println("guess is too low");
                }
            }
            else
            {
                System.out.println("its a wasted guess");
            }

        }
    }
}
