package chapter2;

public class ArithmaticFun {
    public static void main(String[] args) {
        int a=15;
        int b=10;
        int sum=a+b;
        int  difference=a-b;
        int product=a*b;
        int quotient=a/b;
        int remainder=a%b;
        System.out.println("sum is "+sum);

        System.out.println("difference is "+difference);
        System.out.println("product is "+product);
        System.out.println("quotient is "+quotient);
        System.out.println("remainder is "+remainder);
        sum+=20;
        System.out.println("sum is "+sum);
        sum++;
        System.out.println("sum is "+sum);
        sum--;
        System.out.println("sum is "+sum);
        product*=2;
        System.out.println("product is "+product);
    }
}
